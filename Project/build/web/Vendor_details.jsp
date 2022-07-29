
<%@page import="com.connection.*" %>
<%@page import="java.sql.*"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
  
    <script src="Inputvalidate.js" type="text/javascript"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <link href="Detailscss.css" rel="stylesheet" type="text/css"/>
  <script>

             $(document).ready(function() {

        $("#state").on("change", function() {

            var id = $("#state").val();

            if (id === "") {
                $("#error").html("required");

                return false;
            }  else {
                $("#error").html("");

                $.ajax({

                    url: "city.jsp",

                    data: {state: id},

                    method: "POST",

                    success: function(data)

                    {

                        $("#msg").html(data);}});}}); });

         
        </script>

    <title>Vendor details Regisration Form </title> 
</head>
<body onload=" return disableSubmit();">
    <div class="container">
        <h1>Registration 
  	</h1>
        

        <form action="Detailes" method="post" enctype='multipart/form-data' name="add1" multiple=webkitdirectory=''>
            <div class="form first">
                <div class="details personal">
                    <span class="title">Vendor Details</span>

                    <div class="fields">
                        <div class="input-field">
                            <label>Company Name</label>
                            <input type="text" placeholder="Enter your Company Name" maxlength="30" name="cm" pattern="^[A-Z a-z]{2,50}$" required >
                        </div>

                        <div class="input-field" >
                            <label>Type of Company</label>
                            <select id="toc" name="toc" required>
                                <option disabled selected value="">Select Company Type</option>
                                <option value="Public Limited co">Public Limited co</option>
                                <option value="Partnership Co">Partnership Co</option>
                                <option value="Proprietorship">Proprietorship</option>
                                <option value="Govt. Sector"> Govt. Sector</option>
                                <option value="others"> others</option>
                            </select>
                           
                                    <script type="text/javascript">
                                        function ddlValidate() {
                                            var e = document.getElementById("toc");
                                            var e1 = document.getElementById("soc");
                                            var e2 = document.getElementById("state");
                                            var e3 = document.getElementById("ct");
                                            var e4 = document.getElementById("bn")(;
                                            
                                            
                                            var optionSelIndex = e.options[e.selectedIndex].value;
                                            var optionSelIndex1 = e1.options[e1.selectedIndex].value;
                                            var optionSelIndex2 = e2.options[e2.selectedIndex].value;
                                            var optionSelIndex3 = e3.options[e3.selectedIndex].value;
                                            var optionSelIndex4 = e4.options[e4.selectedIndex].value;
                                            
                                           // var optionSelectedText = e.options[e.selectedIndex].text;
                                            if (optionSelIndex == 0) {
                                                alert("Please select a Type of Company");
                                                return false;
                                            }
                                            else if(optionSelIndex1 == 0)
                                            {
                                                alert("Please select a Status of Company ");
                                                return false;
                                            }
                                            
                                            
                                            
                                            else if(optionSelIndex2 == 0)
                                            {
                                                alert("Please select a state");
                                                return false;
                                            }
                                            else if(optionSelIndex3 == 0)
                                            {
                                                alert("Please select a city");
                                                return false;
                                            }
                                            else if(optionSelIndex4 == 0)
                                            {
                                                alert("Please select a Bank Name");
                                                return false;
                                            }
                                             
                                        }
                            
                            </script> 
                                
                        </div>
                        
                         <div class="input-field" >
                            <label>Status of Company</label>
                            <select required name="soc" required>
                                <option disabled selected value="">Select Company Type</option>
                                <option value="MANUFACTURER">MANUFACTURER</option>
                                <option value="AUTHORISED DEALER">AUTHORISED DEALER</option>
                                <option value="STOCKIST/TRADER">STOCKIST/TRADER</option>
                                <option value="IMPORTER/INDIAN AGENT">IMPORTER/INDIAN AGENT</option>
                                <option value="SERVICE PROVIDER">SERVICE PROVIDER</option>
                                
                            </select>
                        </div>

                        <div class="input-field">
                            <label required>Address</label>
                            <textarea id="add" name="add" rows="2" cols="20" required>
                           
                            </textarea>
                        </div>

                        <div class="input-field" >
                            <label>State</label>
                            <select   id="state" name="state" >
                                <option value="">select state</option>
                                <%
                                    
                         ResultSet rs = DatabaseConnection.getResultFromSqlQuery("select * from state_master where active = 1");
                                %>
                               <%try{%>
                              <%while(rs.next()){%>
                              <option value="<%out.print(rs.getInt(1));%>"><%out.print(rs.getString(2));%></option>
                              <%}}catch(Exception e){out.print(e);}%>
                            </select>
                        </div>

                        <div class="input-field" id="msg">
                            <label>City</label>
                             <select required name="ct" id="ct">
                                 <option value="">select city</option>
                               
                            </select>
                        </div>
                        
                        <div class="input-field">
                            <label>Pin code</label>
                            <input type="text" placeholder="Enter your area pin code"  onkeypress="return onlyNos(event,this);" pattern="[0-9]{6}" maxlength="6" required name="pc">
                        
                        </div>
                          <div class="input-field">
                            <label>Mobile Number</label>
                            <input type="tel" placeholder="Enter mobile number" pattern="[0-9]{10}" onkeypress="return onlyNos(event,this);" maxlength="10" name="mn" title="enter digit" required>
                        </div>
                    </div>
                </div>

                      
                <div class="details ID">
                    <span class="title">Bank Details</span>

                    <div class="fields">
                        <div class="input-field">
                            <label>Bank Name:</label>
                            <!--<input type="text" placeholder="Enter Bank Name" name="bn" pattern="^[A-Z a-z]{5,50}$" required>-->
                            <select name="bn"  required>
                            <option value="">select Bank name</option>
                            <option value="Punjab National Bank">Punjab National Bank</option>
                            <option value=" Indian Bank">Indian Bank</option>
                            <option value="State Bank of India">State Bank of India</option>
                            <option value=" Canara Bank"> Canara Bank</option>
                            <option value=" Union Bank of India"> Union Bank of India</option>
                            <option value=" Indian Overseas bank"> Indian Overseas bank</option>
                            <option value="UCO Bank">UCO Bank</option>
                            <option value="Bank of Maharashtra">Bank of Maharashtra</option>
                            <option value=" Punjab and Sind Bank"> Punjab and Sind Bank</option>
                            <option value="Bank of India">Bank of India</option>
                            <option value="Central Bank of India">Central Bank of India</option>
                            <option value="Bank of Baroda">Bank of Baroda</option>
                            </select>
                            
                            
                            
                        </div>

                        <div class="input-field">
                            <label>Bank Branch:</label>
                            <input type="text" placeholder="Enter Bank Branch" name="bb" maxlength="20" pattern="^[A-Z a-z]{2,50}$" required>
                        </div>
                        
                        
                        <div class="input-field">
                            <label>Bank Bankbeneficiary Name:</label>
                            <input type="tel" placeholder="Enter Bank Benificial Name" name="bbn" maxlength="30" onkeypress="return onlyAlphabets(event,this);" pattern="^[A-Z a-z]{2,50}$" required>
                        </div>

                        <div class="input-field">
                            <label >Account No:</label>
                            <input type="tel" placeholder="Enter Account Number" onkeypress="return onlyNos(event,this);" name="ac" required>
                        </div>
                            
                        

                      <div class="input-field">
                            <label>IFSC Code:</label>
                            <input type="text" placeholder="Enter Bank account IFSC code" id="ifsc" maxlength="11" name="ic" pattern="^[A-Z]{4}[0][A-Z0-9]{6}$" required>
                        </div>
                        
                         <div class="input-field">
                            <label>PanCard no:</label>
                            <input type="tel" placeholder="Enter Pan card no" name="pan" id="pan" maxlength="10" pattern="^([A-Z]){5}([0-9]){4}([A-Z]){1}$" required>
                        </div>
                        
                        <div class="input-field">
                            <label>GST no:</label>
                            <input type="tel" placeholder="Enter GST no" name="gst" id="gst" maxlength="15" pattern="^[0-9]{2}[A-Z]{5}[0-9]{4}[A-Z]{1}[1-9A-Z]{1}Z[0-9A-Z]{1}$" required>
                        </div>
                          <div class="input-field">
                            <label>Bank cheque no:</label>
                            <input type="tel" placeholder="Enter Bank cheque no" maxlength="20" name="cheque" id="cheque"  required>
                        </div>
                       
                       
                    </div>
                     <div class="details ID">
                    <span class="title">Document</span>

                    <div class="fields">
                        <div class="Button-field">
                            <label>Pand card:</label>
                            <input type="File"  name="panp" accept="image/*" required>
                        </div>
                            
                        <div class="Button-field">
                            <label>Bank cheque :</label>
                            <input type="file"  name="chequep" accept="image/*" required>
                        </div>
                                                          
                        <div class="Button-field">
                            <label>Pass Book:</label>
                            <input type="file"  name="passp" accept="image/*" required>
                        </div>

                        <div class="Button-field">
                            <label>Gst no:</label>
                            <input type="file" required accept="image/*" name="gstp">
                        </div>
                        </div>
                    <br/>
                    
                    <script>
                         function callrt()
                       {
                           
                            if(document.getElementById("terms").checked==true)
                            {
                                
                                   document.getElementById("btn").disabled = false;
                            }
                            else
                            {
                               document.getElementById("btn").disabled = true;
                            }
                         
                          
                       }
                         function disableSubmit() {
                                document.getElementById("submit").disabled = true;
                               }
                        
                        </script>
                        <input type="checkbox" name="terms" id="terms" onchange="return callrt()">  I Agree Terms & Coditions <p> you must first our vendor</p>
                   
      
                     <input type="submit" style="height:50px;width:150px;background-color:red;font-size:20px;color:lightwhite"  id="btn" disabled="disabled">
                    
                       
                         <span class="btnText"  onclick=" return ddlValidate();" > </span>
                    
                  <i class="uil uil-navigator"></i>
                  
                        
                       

                    
                </div> 
            </div>
            

          
            </div>
        </form>
    </div>

   
</body>
</html>