function cals(){
		var value1 = document.frm.price1.value
	var value2 = document.frm.price2.value
	if(value1=="" || value2==""){
		return;
	}else{
		document.frm.price3.value = value2 - value1;
	}
}
