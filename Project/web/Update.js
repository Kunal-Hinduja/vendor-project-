/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


   // $(document).on('click','button[data-role=update]',function(){
                                
                                function update(id){ 
                                
                               $.ajax({
                                   
                                   url: 'Activation',
                                   
                                   type: 'POST',        
                                   data:{
                                       id :id,
                                     //  action:"update"
                                  
                                   },
                                  
                                   success:function(response)
                                   {
                                       console.log(response);
                                      
                                       location.reload(true);
                                        
                                    
                                     }
                                 })    
                 
                          //  })
                      }
                            
                           