function GenerateCaptcha() {  
            var chr1 = Math.ceil(Math.random() * 10) + '';  
            var chr2 = Math.ceil(Math.random() * 10) + '';  
            var chr3 = Math.ceil(Math.random() * 10) + '';  
  
            var str = new Array(4).join().replace(/(.|$)/g, function () { return ((Math.random() * 36) | 0).toString(36)[Math.random() < .5 ? "toString" : "toUpperCase"](); });  
            var captchaCode = str + chr1 + ' ' + chr2 + ' ' + chr3;  
            document.getElementById("txtCaptcha").value = captchaCode  
        }  
  
  
    function validation(){  
             var pass = document.getElementById('pass').value;
             var cpass = document.getElementById('pass1').value;
             var str1 = removeSpaces(document.getElementById('txtCaptcha').value);  
             var str2 = removeSpaces(document.getElementById('txtCompare').value);
           //var ps ="/^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,20}$/";
           
        
        
        
        if(pass==""){
            alert("Password must be required");
            return false;
        }
        
        else   if(pass!=cpass)
             {
                 alert("Password And Confirm Password Must Be Same..!!");
                 return false;
             }
        
     else   if(str2=="")
        {
            alert("Please Eneter Captcha ");
            return false;
        }
        
      else  if (str1 != str2){ 
            
            alert("Invalid captcha");
            return false;
        }
        
        
        
         }
               
      
  
        /* Remove spaces from Captcha Code */  
        function removeSpaces(string) {  
            return string.split(' ').join('');  
        }  
      