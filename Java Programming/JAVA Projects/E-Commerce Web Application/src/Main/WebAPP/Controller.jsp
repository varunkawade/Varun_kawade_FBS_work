<jsp:useBean id="bean" class="com.myservlet.ServiceBean">
<jsp:setProperty name="bean" property="*"/>
</jsp:useBean>

<p>you have provided following type of an account </p>
<jsp:getProperty property="type" name="bean"/>
<p>serivce provided is an below</p>
<jsp:getProperty property="serviceStatus" name="bean"/>