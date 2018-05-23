<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.baosight.iplat4j.ef.ui.column.*,java.util.*,com.baosight.iplat4j.core.resource.I18nMessages"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="erp" uri="/WEB-INF/erp-select.tld" %>
<%@ taglib uri="/WEB-INF/framework/tlds/EF.tld" prefix="EF"%>
<%@ taglib prefix="pscs" uri="/WEB-INF/erp-select.tld" %>
<%
	String contextpath = request.getContextPath();
	String actionUrl = contextpath + "/DispatchAction.do";
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
<title>合同管理</title>

<script type="text/javascript" src="./EF/EF.js"></script>
<script type="text/javascript" src="./js/Common.js"></script>
<script type="text/javascript" src="./PH/CT/${serviceName}.js"></script>

</head>
<body class="bodyBackground">
<form id="${serviceName}" method="POST" action="<%=actionUrl%>">
<jsp:include flush="true" page="../../EF/Form/EFFormHead.jsp"></jsp:include>


<div id="ef_region_inqu" title="查询条件">
<div>
<table  width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="#FFFFFF">
	<tr>
		<td align="right" class="tableRow1">系统合同号：</td>
		<td align="left" class="tableRow0">
		<EF:EFInput blockId="inqu_status" ename="bpoId" row="0" />
		</td>
		
		<td align="right" class="tableRow1">内部合同号：</td>
		<td align="left" class="tableRow0">
		<EF:EFInput blockId="inqu_status" ename="headerCol49"
			etc=" maxlength='10'" row="0" />
		</td>
	</tr>
	<tr>
		<td align="right" class="tableRow1">合同版本号：</td>
		<td align="left" class="tableRow0">
		<EF:EFInput blockId="inqu_status" ename="bpoVer"
			etc=" maxlength='10'" row="0" />
		</td>
		
		<td align="right" class="tableRow1"><%=I18nMessages.getText("pscs.ph.BPO_TYPE") %></td>
		<td align="left" class="tableRow0">
			<erp:select blockId="result" row="0" name="bpoType" codeName="ph.BPO_TYPE" link="true" defaultLabel="请选择" defaultValue="" />
		</td>
		
	</tr>
	<tr>
		<td align="right" class="tableRow1">合同拥有者：</td>
		<td align="left" class="tableRow0">
		<EF:EFSelect blockId="inqu_status" ename="ownerUserId" row="0">
			<EF:EFOption label="请选择" value="" />
			<EF:EFOptions blockId="ownerUserList" labelColumn="userCname" valueColumn="userId"/>
		 </EF:EFSelect> 
		</td>
		
		<td align="right" class="tableRow1"></td>
		<td align="left" class="tableRow0"></td>
	</tr>
</table>
</div>
</div>


<div id="ef_region_result" title="合同信息" style="overflow:scroll">
<div id="ef_grid_result" style="overflow:scroll;"></div>
</div>

<EF:EFGrid blockId="result" autoDraw="yes" readonly="false">
	<EF:EFColumn ename="bpoId" cname="合同编号" width="200" align="center"  enable="false" />
	<EF:EFColumn ename="bpoVer" cname="合同版本号" width="100" align="center"  enable="false" />
	<EF:EFColumn ename="ownerUserName" cname="合同拥有者名称" width="100" align="center" enable="false"/>
	<EF:EFColumn ename="stateId" cname="合同状态" width="100" align="center" enable="false" />
	<EF:EFComboColumn ename="ownerUserId1" cname="合同转让人" align="center" width="100" blockName="ownerUserList" valueProperty="userId" labelProperty="userCname" formatString="#labelString#">
		<EF:EFOption value="" label="请选择···" />
	</EF:EFComboColumn>
	</EF:EFGrid> <EF:EFRegion /> 
<jsp:include flush="false" page="../../EF/Form/EFFormTail.jsp"></jsp:include></form>
</body>
</html>
