/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


  function mxrow(){
                           $('.pagination').html('')
                           var trnum=0;
                           var maxrows=parseInt($('#maxRows').val())
                           var totalrow=$('#myTable tbody tr').length
                           $('#myTable tr:gt(0)').each(function (){
                           trnum++;
                           if(trnum>maxrows){
                                        $(this).hide()
                                    }
                                    if(trnum<=maxrows){
                                        $(this).show()
                                    }
                                })
                                if(totalrow > maxrows){
                                var pagenum=Math.ceil(totalrow/maxrows)
                                for(var i=1;i<=pagenum;){
                                            $('.pagination').append('<li data-page="'+i+'">\<span>'+ i++ +'<span class="sr-only">(current)</span></span>\<\li>').show()
                                }  }
                            $('.pagination li:first-child').addClass('active')
                            $('.pagination li').on('click',function (){
                            var pageNum = $(this).attr('data-page')
                            var trIndex=0;
                            $('.pagination li').removeClass('active')
                            $(this).addClass('active')
                            $('#myTable tr:gt(0)').each(function() {
                            trIndex++
                            if(trIndex > (maxrows*pageNum) || trIndex <=((maxrows*pageNum)-maxrows)){
                            $(this).hide()
                            }else{
                              $(this).show()
                            }
                            })
                           })
                           console.log(totalrow);
                       }
                                    $(function (){
                           var id=0;
                           $('table tr:eq(0)').each(function (){
                           id++;
                       })
                   })