var xmlhttp;
  /// code for IE7+, Firefox, Chrome, Opera, Safari
if(window.XMLHttpRequest){
  xmlhttp = new XMLHttpRequest() ;///bikin XMLHttpRequest object buat request n response data ke server gk pake loading
}
else {
  /// code for IE6, IE5
  xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
}

function checkUsername() {///cek username pas ngetik di textbox
  var username = document.getElementById('checkusername').value///buat ngambil username yg punya id checkusername di index.jsp
  if(username.length>=4){///kalo username>=4
    xmlhttp.open("POST","checkusername?username="+username,true);//post ke checkusername (url pattern), post ke CheckUsername.java
    document.getElementById("username").innerHTML = '<img src="loading.gif" border="0" alt="Loading, please wait.."/>';///set loading image
    xmlhttp.onreadystatechange=function(){///nampilin hasil dari CheckUsername.java
      if(xmlhttp.readyState==4&&xmlhttp.status==200){
        document.getElementById("username").innerHTML = xmlhttp.responseText;
      }
    }
    xmlhttp.send(null);
  }
  else {
    document.getElementById('username').innerHTML='<blink><font color ="yellow"/>Username must have atleast 4 characters..</blink>';
  }


}
