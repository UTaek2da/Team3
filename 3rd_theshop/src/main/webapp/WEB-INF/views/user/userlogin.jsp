<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>
<style>
body{
background: grey;
}
a{
text-decoration: none;
color: black;
}
.img_01 {
  width: 60px;
  height: 60px;
  object-fit: cover;
  margin-bottom: 10px;
}
.p_01{
	font-size: small;
}

.mainclass_01{
	margin-left: 30px;
	margin-top: 100px;
	margin-bottom: 100px;
	color: red;	
}
.loginmaindiv{
background: pink;
}
.pass_01{
margin-top: 10px;
margin-bottom: 10px
}
.subsearch{
text-align: center;
font-size: small;
margin-top: 20px;
margin-bottom: 50px;
}
.anylogin{
	text-align: center;
	
}
.copyright_login{
text-align: center;
font-size: small;
margin-top: 109px;
margin-bottom: 100px;
}


</style>

<!-- sub contents start -->
<div class="container-fluid">
	<div class="row">
		<!-- 왼쪽 여백 디브 -->
		<div class="col-4"></div>
			<!-- 내용 시작 -->
			<div class="col-4 loginmaindiv">
				<div class="row">
					<div class="col-1"></div>
					<div class="col-10">
						
						<!-- 더 샵 -->
						<h3 class="mainclass_01">THE #</h3>
						
						<!-- 로그인 유지 디브 -->
						<div class="checkbox mb-3">
	      				<label>
	        				<input type="checkbox" value="로그인 유지"> 로그인 유지
	      				</label>
	    				</div>
	    				
						<!-- 폼 시작 -->
						<form method="post" action="/user/userloginpro.do">
						<!-- 아이디 입력칸 -->
						<div class="form-floating">
			     			<input type="text" class="form-control" id="floatingInput" name="username">
			     			<label for="floatingInput">아이디</label>
			   			</div>
						<!-- 비밀번호 입력탄 -->
						<div class="form-floating pass_01">
			      			<input type="password" class="form-control" id="floatingPassword" name="password">
			      			<label for="floatingPassword">비밀번호</label>
			    		</div>
			    		<!-- 로그인 버튼 -->
			    		<button class="w-100 btn btn-lg btn-primary" type="submit">로그인</button>
						</form>
						<!-- 폼끝 -->
	    				<!-- 찾기 회원가입 디브 -->
			    		<div class="subsearch">
			    			<a href="#"><span>아이디찾기</span></a>&nbsp;&nbsp;|&nbsp;&nbsp;
			    			<a href="#"><span>아이디찾기</span></a>&nbsp;&nbsp;|&nbsp;&nbsp;
			    			<a href="#"><span>회원가입</span></a> 
			    		</div>
			    		<!-- 다른 로그인 디브 -->
			    		<div class="anylogin">
			    			<div class="row">
			    				<!-- 네이버 로그인 -->
			    				<div class="col-4">
			    				<!-- 네이버로그인 링크 -->
			    					<a href="#">
			    					<img src="../resources/image/naver.PNG" class="img_01">
			    					</a>			
			    					<p class="p_01">네이버 로그인</p>
			    				</div>			   
			    				
			    				<!-- 카카오 로그인 -->
			    				<div class="col-4">
			    				<!-- 카카오 로그인 링크 -->
									<a href="#">	
			    					<img src="../resources/image/kakao.PNG" class="img_01">
			    					</a>
			    					<p class="p_01">카카오 로그인</p>
			    				</div>
			    				
			    				<!-- 구글 로그인 -->
			    				<div class="col-4">
			    				<!-- 구글 로그인 링크 -->
			    					<a href="#">
			    					<img src="../resources/image/google.PNG" class="img_01">
			    					</a>
			    					<p class="p_01">구글 로그인</p>
			    				</div>
			    			</div>
			    		</div>
	    			
	    			<div class="copyright_login">
	    				<span>Copyright @ the# Co. Ltd. All Rights Reserved</span>
	    			</div>
	    			</div>
					<div class="col-1"></div>
				</div>
			</div>
		<!-- 내용 끝-->	
			
		<!-- 오른쪽 여백 디브 -->
		<div class="col-4"></div>
	</div>
</div>


<!-- sub contents end -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
