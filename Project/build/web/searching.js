/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


 
//        {
//                        var input, filter, table, tr, td, i, txtValue;
//                        input = document.getElementById("myInput");
//                        filter = input.value.toUpperCase();
//                        table = document.getElementById("myTable");
//                        tr = table.getElementsByTagName("tr");
//                        for (i = 0; i < tr.length; i++) {
//                                td = tr[i].getElementsByTagName("td")[0];
//                                if (td) {
//                                txtValue = td.textContent || td.innerText;
//                                if (txtValue.toUpperCase().indexOf(filter) > -1) {
//                                tr[i].style.display = "";
//                                } else {
//                                tr[i].style.display = "none";
//                                }
//                            }      
//                           }
//                        }
                             $('#myInput').keyup(function(){
                              // Search Text
                              var search = $(this).val();

                              // Hide all table tbody rows
                              $('table tbody tr').hide();

                              // Count total search result
                              var len = $('table tbody tr:not(.notfound) td:contains("'+search+'")').length;

                              if(len > 0){
                                // Searching text in columns and show match row
                                $('table tbody tr:not(.notfound) td:contains("'+search+'")').each(function(){
                                  $(this).closest('tr').show();
                                });
                              }else{
                                $('.notfound').show();
                              }

                            });