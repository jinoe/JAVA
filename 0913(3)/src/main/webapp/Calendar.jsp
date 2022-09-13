<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<%@page import="com.tjoeun.mycalendar.MyCalendar"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>만년 달력</title>
<style type="text/css">
tr {
	height: 80px;
}

th {
	font-size: 20pt;
	width: 100px;
}

th#title {
	font-size: 30pt; /* 글꼴크기 */
	font-family: D2Coding; /* 글꼴 */
	font-weight: bold; /* 굵기 */
	color: tomato; /* 글자 색 */
}

th#sunday {
	color: red;
}

th#saturday {
	color: blue;
}

td {
	text-align: right; /* 수평정렬 */
	vertical-align: top; /* 수직정렬 */
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

	//	컴퓨터 시스템의 년, 월을 얻어온다.

	/*	Date date = new Date();
		int year = date.getYear() + 1900;
		int month = date.getMonth() + 1; */

	// out.println(year + "년 " + month + "월");

	Calendar calendar = Calendar.getInstance();
	int year = calendar.get(Calendar.YEAR);
	int month = 12;//calendar.get(Calendar.MONTH) + 1;
	%>

	<table width="700" border="1" align="center" cellpadding="5"
		cellspacing="0">
		<tr>
			<th id="title" colspan="7"><%=year%>년 <%=month%>월</th>
		</tr>
		<tr>
			<th id="sunday">일</th>
			<th>월</th>
			<th>화</th>
			<th>수</th>
			<th>목</th>
			<th>금</th>
			<th id="saturday">토</th>
		</tr>
		<!-- 달력에 날짜를 출력한다. -->
		<!-- 1일 부터 달력을 출력할 달의 마지막 날짜까지 반복하며 날짜를 출력한다. -->
		<tr>
			<%
			// 빈칸에 출력될 전달 날짜의 시작일을 계산한다.
			int start = 0;
			int week = MyCalendar.weekDay(year, month, 1);
			if (month == 1) {
				start = MyCalendar.lastDay(year - 1, 12) - week;
			} else {
				start = MyCalendar.lastDay(year, month - 1) - week;
			}

			// 1일이 출력될 위치를 맞추기 위해 달력을 출력할 달 1일의 요일만큼 반복하며 빈 칸을 출력한다.

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
				// 출력할 날짜가 토요일이면 줄을 바꾼다.
				if (MyCalendar.weekDay(year, month, i) == 6) {
					out.println("</tr>");
					out.println("<tr>");
				}
			}
			start = 0;
			if (month == 12) {
				week = MyCalendar.weekDay(year + 1, 1, 1); // 12월
			} else {
				week = MyCalendar.weekDay(year, month + 1, 1); // 1~11월
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