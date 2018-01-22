<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<form id="updToUser">

<input type="hidden" value="${list.id }" class="form-control" name="id" >
<input type="text" class="form-control" value="${list.name }" name="name">


</form>