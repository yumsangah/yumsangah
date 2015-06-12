function checkForm(form){   }

function selectForm(form){ }

function deleteCheck(addrForm, root){
	var url=root + "/addr/deleteOk.do?name=" + addrForm.name.value;
	alert(url);
	
	var value=confirm("정말로 삭제하시겠습니까");
	
	if(value==true){//예
		location.href=url;
	}else{//아니오
		alert("삭제되지 않았습니다.");
	}
}