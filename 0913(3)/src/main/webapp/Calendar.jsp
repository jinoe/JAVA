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
table {
	/* border: ���β� ������ ������" */
	border: none;
}

tr {
	height: 80px;
}

th {
	font-size: 20pt;
	width: 100px;
	border: none;
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
	border: 1px solid black;
	border-radius: 10px;
}

td.sun {
	color: red;
}

td.sat {
	color: blue;
}

td.holiday {
	background-color: red;
	color: white;
	font-weight: bold;
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

td#choice {
	text-align: left;
}
/* 
	�����۸�ũ ��Ÿ�� �����ϱ�
	link : 1���� Ŭ������ ���� �����۸�ũ
	visited : 1�� �̻� Ŭ���� �����۸�ũ
	hover : �����۸�ũ�� ���콺�� �ø��� ������
	active : �����۸�ũ�� ���콺�� ������ ������
 */

/* ���� ������ ����ǹǷ� "," �� ������ �� ���� */
a:link, a:visited {
	color: black;
	text-decoration: none;
	font-size: 20pt;
}

a:hover {
	text-decoration: overline;
}

a:active {
	text-decoration: overline;
	color: red;
}

.button {
	background-color: #4CAF50; /* Green */
	border: none;
	color: white;
	padding: 5px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	margin: 0;
	transition-duration: 0.4s;
	cursor: pointer;
}

.button1 {
	background-color: white;
	color: black;
	border: 2px solid #4CAF50;
}

.button1:hover {
	background-color: #4CAF50;
	color: white;
}

select.select {
	width: 100px;
	height: 30px;
}

fieldset {
	width: 100px;
	height: 50px;
	display: inline;
	border: none;
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
	int month = calendar.get(Calendar.MONTH) + 1;

	// ������, ������ ������ ��ũ�� Ŭ���Ǹ� get ������� �Ѿ���� �޷��� ����� ��, ���� �޴´�.
	/* ������, ������ �����۸�ũ �Ǵ� ��ư�� Ŭ���Ǹ� get ������� �Ѿ���� �޷��� ����� ��, ���� �޴´�.
	   �޷��� ���ʷ� ����Ǹ� ���� �������� �������� �ʱ⶧���� �Ѿ���� �����Ͱ� �����Ƿ� year�� month��
	   null �̹Ƿ� NumberFormatException�� �߻��ȴ�.
	*/

	try {
		year = Integer.parseInt(request.getParameter("year"));
		month = Integer.parseInt(request.getParameter("month"));

		// month�� 13�� �Ѿ��������� ������ 1����, 0�� �Ѿ���� ���⵵ 12���� �����Ѵ�.
		if (month == 13) {
			year++;
			month = 1;
		} else if (month == 0) {
			year--;
			month = 12;
		}
	} catch (NumberFormatException e) {

	}
	%>

	<table width="700" border="1" align="center" cellpadding="5"
		cellspacing="0">
		<tr>
			<!-- 
			�±װ� ������ ���ڿ��� Ŭ���ϸ� href �Ӽ����� �̵��Ѵ�.
			"?"�ڿ� �̵��ϴ� �������� ������ �����͸� �Ѱ��ִµ� �̶� �����Ͱ� 2�� �̻��̸� �����Ϳ�
			������ ���̿� "&"�� �־ �����Ѵ�.
			"?"�ڿ��� ����� ���⸦ �ϸ� �ȵȴ�.
			 -->
			<th colspan="1"><a
				href="Calendar.jsp?year=<%=year%>&month=<%=month - 1%>">������</a></th>
			<%-- <th>
				<input type="button" class="button button1" value="������" onclick="location.href=?year=<%=year%>&month=<%=month-1%>">
			</th> --%>
			<th id="title" colspan="5"><%=year%>�� <%=month%>��</th>
			<%-- <th>
				<button type="button" class="button button1" onclick="location.href=?year=<%=year%>&month=<%=month+1%>">������</button>
			</th> --%>
			<th colspan="1"><a
				href="Calendar.jsp?year=<%=year%>&month=<%=month + 1%>">������</a></th>
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
			
			// ��ü������
			Boolean flag0301 = false;
			int subHoilday0301 = 0;
			
			
				
			for (int i = 1; i <= MyCalendar.lastDay(year, month); i++) {
				
				if(MyCalendar.weekDay(year, 3, 1)==6){
					flag0301 = true;
					subHoilday0301 = 3;
				}
				
				if (month == 1 && i == 1) {
					out.println("<td class='holiday'>" + i + "<br><span>����</span></td>");
				} 
				else if (month == 7 && i == 29) {
					out.println("<td class='holiday'>" + i + "<br><span>Jiwoo Birthday</span></td>");
				} 
				else if (month == 3 && i == 1) {
					out.println("<td class='holiday'>" + i + "<br><span>������</span></td>");
				} 
				else if (month == 5 && i == 1) {
					out.println("<td class='holiday'>" + i + "<br><span>�ٷ����ǳ�</span></td>");
				}
				else if (month == 6 && i == 6) {
					out.println("<td class='holiday'>" + i + "<br><span>������</span></td>");
				} 
				else if (month == 5 && i == 5) {
					out.println("<td class='holiday'>" + i + "<br><span>��̳�</span></td>");
				} 
				
				else {
					switch (MyCalendar.weekDay(year, month, i)) {
					case 0:
						out.println("<td class='sun'>" + i + "</td>");
						break;
					case 6:
						out.println("<td class='sat'>" + i + "</td>");
						break;
					default:
						out.println("<td>" + i + "</td>");
						break;
					}
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

		<!-- ��,�� �� �����ϰ� ���� ��ư�� Ŭ���ϸ� ���õ� ���� �޷����� �ѹ��� �Ѿ�� �Ѵ�. -->
		<tr>
			<td colspan="7" id="choice">
				<form action="?" , method="post">
					<fieldset>
						<legend>��</legend>
						<select name="year" class="select">
							<%
							for (int i = 1900; i <= 2100; i++) {
								if (i == calendar.get(Calendar.YEAR)) {
									out.println("<option selected='selected'>" + i + "</option>");
								}
								out.println("<option>" + i + "</option>");
							}
							%>
						</select>
					</fieldset>
					<fieldset>
						<legend>��</legend>
						<select name="month" class="select">
							<%
							for (int i = 1; i <= 12; i++) {
								if (i == calendar.get(Calendar.YEAR)) {
									out.println("<option selected='selected'>" + i + "</option>");
								}
								out.println("<option>" + i + "</option>");
							}
							%>
						</select>
					</fieldset>
					<input class="select" type="submit" value="����">
				</form>
			</td>
		</tr>
	</table>
</body>
</html>