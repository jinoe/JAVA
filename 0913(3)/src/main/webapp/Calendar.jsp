<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<%@page import="com.tjoeun.mycalendar.MyCalendar"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���� �޷�</title>
<style type="text/css">
tr {
	height: 80px;
}

th {
	font-size: 20pt;
	width: 100px;
}

th#title {
	font-size: 30pt; /* �۲�ũ�� */
	font-family: D2Coding; /* �۲� */
	font-weight: bold; /* ���� */
	color: tomato; /* ���� �� */
}

th#sunday {
	color: red;
}

th#saturday {
	color: blue;
}

td {
	text-align: right; /* �������� */
	vertical-align: top; /* �������� */
}

td.sun {
	color: red;
}

td.sat {
	color: blue;
}

td#beforesun {
	color: red;
	font-size: 10pt;
	background-color: lavender;
}

td#before {
	font-size: 10pt;
	background-color: lavender;
}

td#aftersat {
	color: blue;
	font-size: 10pt;
	background-color: yellowgreen;
}

td#after {
	font-size: 10pt;
	background-color: yellowgreen;
}
</style>
</head>
<body>

	<%
	/*	out.println(MyCalendar.isLeapYear(2000));
		out.println(MyCalendar.lasthay(2022, 8));
		out.println(MyCalendar.totalDay(2022, 9, 13));
		out.println(MyCalendar.weekDay(2022, 9, 13));	*/

	//	��ǻ�� �ý����� ��, ���� ���´�.

	/*	Date date = new Date();
		int year = date.getYear() + 1900;
		int month = date.getMonth() + 1; */

	// out.println(year + "�� " + month + "��");

	Calendar calendar = Calendar.getInstance();
	int year = calendar.get(Calendar.YEAR);
	int month = 12;//calendar.get(Calendar.MONTH) + 1;
	%>

	<table width="700" border="1" align="center" cellpadding="5"
		cellspacing="0">
		<tr>
			<th id="title" colspan="7"><%=year%>�� <%=month%>��</th>
		</tr>
		<tr>
			<th id="sunday">��</th>
			<th>��</th>
			<th>ȭ</th>
			<th>��</th>
			<th>��</th>
			<th>��</th>
			<th id="saturday">��</th>
		</tr>
		<!-- �޷¿� ��¥�� ����Ѵ�. -->
		<!-- 1�� ���� �޷��� ����� ���� ������ ��¥���� �ݺ��ϸ� ��¥�� ����Ѵ�. -->
		<tr>
			<%
			// ��ĭ�� ��µ� ���� ��¥�� �������� ����Ѵ�.
			int start = 0;
			int week = MyCalendar.weekDay(year, month, 1);
			if (month == 1) {
				start = MyCalendar.lastDay(year - 1, 12) - week;
			} else {
				start = MyCalendar.lastDay(year, month - 1) - week;
			}

			// 1���� ��µ� ��ġ�� ���߱� ���� �޷��� ����� �� 1���� ���ϸ�ŭ �ݺ��ϸ� �� ĭ�� ����Ѵ�.

			for (int i = 0; i < MyCalendar.weekDay(year, month, 1); i++) {
				if (i == 0) {
					out.println("<td id='beforesun'>" + (month == 1 ? 12 : month - 1) + "/" + ++start + "</td>");
				} else {
					out.println("<td id='before'>" + (month == 1 ? 12 : month - 1) + "/" + ++start + "</td>");
				}
			}
			for (int i = 1; i <= MyCalendar.lastDay(year, month); i++) {
				switch (MyCalendar.weekDay(year, month, i)) {
				case 0:
					out.println("<td class='sun'>" + i + "</td>");
					break;
				case 6:
					out.println("<td class='sat'>" + i + "</td>");
					break;
				default:
					out.println("<td>" + i + "</td>");
				}
				/*out.println("<td>" + i + "</td>");*/
				// ����� ��¥�� ������̸� ���� �ٲ۴�.
				if (MyCalendar.weekDay(year, month, i) == 6) {
					out.println("</tr>");
					out.println("<tr>");
				}
			}
			start = 0;
			if (month == 12) {
				week = MyCalendar.weekDay(year + 1, 1, 1); // 12��
			} else {
				week = MyCalendar.weekDay(year, month + 1, 1); // 1~11��
			}
			if (week != 0) {
				for (int i = week; i <= 6; i++) {
					if (i == 6) {
				out.println("<td id='aftersat'>" + (month == 12 ? 1 : month + 1) + "/" + ++start + "</td>");
					} else {
				out.println("<td id='after'>" + (month == 12 ? 1 : month + 1) + "/" + ++start + "</td>");
					}
				}
			}
			%>
		</tr>
	</table>
</body>
</html>