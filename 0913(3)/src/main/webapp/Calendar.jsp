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
table {
	/* border: 선두께 선종류 선색상" */
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
	하이퍼링크 스타일 지정하기
	link : 1번도 클릭하지 않은 하이퍼링크
	visited : 1번 이상 클릭한 하이퍼링크
	hover : 하이퍼링크에 마우스를 올리고 있을때
	active : 하이퍼링크를 마우스로 누르고 있을때
 */

/* 같은 서식이 적용되므로 "," 로 구분할 수 있음 */
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

	//	컴퓨터 시스템의 년, 월을 얻어온다.

	/*	Date date = new Date();
		int year = date.getYear() + 1900;
		int month = date.getMonth() + 1; */

	// out.println(year + "년 " + month + "월");

	Calendar calendar = Calendar.getInstance();
	int year = calendar.get(Calendar.YEAR);
	int month = calendar.get(Calendar.MONTH) + 1;

	// 이전달, 다음달 하이퍼 링크가 클릭되면 get 방식으로 넘어오는 달력을 출력할 년, 월을 받는다.
	/* 이전달, 다음달 하이퍼링크 또는 버튼이 클릭되면 get 방식으로 넘어오는 달력을 출력할 년, 월을 받는다.
	   달력이 최초로 실행되면 이전 페이지가 존재하지 않기때문에 넘어오는 데이터가 없으므로 year와 month가
	   null 이므로 NumberFormatException이 발생된다.
	*/

	try {
		year = Integer.parseInt(request.getParameter("year"));
		month = Integer.parseInt(request.getParameter("month"));

		// month에 13이 넘어오면왔으면 다음해 1월을, 0이 넘어오면 전년도 12월을 설정한다.
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
			태그가 설정된 문자열을 클릭하면 href 속성으로 이동한다.
			"?"뒤에 이동하는 페이지로 전달할 데이터를 넘겨주는데 이때 데이터가 2건 이상이면 데이터와
			데이터 사이에 "&"를 넣어서 구분한다.
			"?"뒤에는 절대로 띄어쓰기를 하면 안된다.
			 -->
			<th colspan="1"><a
				href="Calendar.jsp?year=<%=year%>&month=<%=month - 1%>">이전달</a></th>
			<%-- <th>
				<input type="button" class="button button1" value="이전달" onclick="location.href=?year=<%=year%>&month=<%=month-1%>">
			</th> --%>
			<th id="title" colspan="5"><%=year%>년 <%=month%>월</th>
			<%-- <th>
				<button type="button" class="button button1" onclick="location.href=?year=<%=year%>&month=<%=month+1%>">다음달</button>
			</th> --%>
			<th colspan="1"><a
				href="Calendar.jsp?year=<%=year%>&month=<%=month + 1%>">다음달</a></th>
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
			
			// 대체공휴일
			Boolean flag0301 = false;
			int subHoilday0301 = 0;
			
			
				
			for (int i = 1; i <= MyCalendar.lastDay(year, month); i++) {
				
				if(MyCalendar.weekDay(year, 3, 1)==6){
					flag0301 = true;
					subHoilday0301 = 3;
				}
				
				if (month == 1 && i == 1) {
					out.println("<td class='holiday'>" + i + "<br><span>신정</span></td>");
				} 
				else if (month == 7 && i == 29) {
					out.println("<td class='holiday'>" + i + "<br><span>Jiwoo Birthday</span></td>");
				} 
				else if (month == 3 && i == 1) {
					out.println("<td class='holiday'>" + i + "<br><span>삼일절</span></td>");
				} 
				else if (month == 5 && i == 1) {
					out.println("<td class='holiday'>" + i + "<br><span>근로자의날</span></td>");
				}
				else if (month == 6 && i == 6) {
					out.println("<td class='holiday'>" + i + "<br><span>현충일</span></td>");
				} 
				else if (month == 5 && i == 5) {
					out.println("<td class='holiday'>" + i + "<br><span>어린이날</span></td>");
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

		<!-- 년,월 을 선택하고 보기 버튼을 클릭하면 선택된 달의 달력으로 한번에 넘어가게 한다. -->
		<tr>
			<td colspan="7" id="choice">
				<form action="?" , method="post">
					<fieldset>
						<legend>년</legend>
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
						<legend>월</legend>
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
					<input class="select" type="submit" value="보기">
				</form>
			</td>
		</tr>
	</table>
</body>
</html>