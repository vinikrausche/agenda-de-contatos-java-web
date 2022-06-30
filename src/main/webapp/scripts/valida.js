/**Validador do arquivo novo-contato.jsp
 * @author Vinícius Krausche
 */
 
  
 function valida(e){
	
	let nome = form.nome.value
	let fone = form.fone.value
	let email = form.email.value
	
	if(!nome || !fone){
		e.preventDefault();
		alert('Preencha todos os campos')
		return false;
	}else{
		console.log(nome,fone,email)
	
		document.forms['form'].submit()
	}
		
	
}

let btn = document.querySelector('#submit')
 
 
 
 btn.addEventListener('click',function(e){
	
	valida(e)
})
