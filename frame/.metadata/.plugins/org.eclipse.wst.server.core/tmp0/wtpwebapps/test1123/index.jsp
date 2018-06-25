<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="js/jquery-3.3.1.slim.js"></script>
<script src="js/bootstrap.min.js"></script>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap-theme.min.css" rel="stylesheet">
<style type="text/css">
    /*  header  */
    .main_font{
        font-family: 'Open Sans',sans-serif;
        color: #313131;
        line-height: 18px;
        font-size: 14px;
        font-weight: 800;
        text-transform: uppercase;
        text-shadow: none;
        text-decoration: none;
        text-align: left;
    }
    .header{
        padding: 36px 0 21px 0;
        background: #fff;
        border-top: 5px #d00b01 solid;
    }
    .nav>li{
        float: left;
    }
    .main_menu{
    }
    .menu_img{
        width: 300px;
        float: left;
    }
    .menu_login{
        float: right;
        margin-right: 18px;
    }
    .form-control{
        height: 30px;
    }
    .input_box{
    }
    .btn{
        padding: 4px 12px;
    }
    .menu_bar{
        width: 576px;
        float: right;
        padding-left: 13px;
    }
    .sub-menu{
        width: 113px;
        zoom: 1;
        margin-top: 22px;
        display: none;
        position: absolute;
        list-style: none;
        background-color: #fff;
        border-top: 4px #d00b01 solid;
        padding: 10px;
    }
    .top-menu:hover .sub-menu{
        display: block;
    }
    .nav>li{
        margin: 0px 3px;
    }
    .nav>li:visited ,.nav>li:active,.nav>li>a:visited,.nav>li>a:active{
        background-color: white;
    }
    .nav>li>a{
        font-family: 'Open Sans',sans-serif;
        color: #313131;
        line-height: 18px;
        font-size: 14px;
        font-weight: 800;
        text-transform: uppercase;
        text-shadow: none;
        text-decoration: none;
        text-align: left;
    }
    .nav>li>a:hover{
        color: #c5c5c5;
        background: none;
    }
    /*  //header  */

    /* main contents */
    .page_container{
        height: 500px;
        background-color: thistle;
    }
    /* //main contents  */

    /* footer */
    .footer{
        background-color: #1e1e1e;
        padding: 23px 0px 26px 0px;
    }
    .footer_L{
        width: 380px;
        float: left;
    }
    .copyright{
        color: #444;
        line-height: 16px;
        font-family: Arial;
        font-size: 12px;
    }
    .footer_R{
        width: 563px;
        float: right;
        margin: 16px 0px 0px 0px;
    }
    .fright{
        float: right;
        margin-right: 18px;
    }
    .inp_search{
        height: 23px;
        color: #1e1e1e;
        background-color: #393939;
        width: 200px;
        border: 1px #393939 solid;
        border-radius: 3px;
        font-size: 12px;
    }
    .footer_menu{
        float: right;
        margin-top: 10px;
    }
    /* //footer */
@media all and (max-width: 991px) {
    /* header */
    .main_menu{

    }
    .menu_img{
        width: 100%;
        text-align: center;
        margin: 0px 0px 10px 0px;
    }
    .menu_login{
        width: 100%;
        margin: 0px auto;
        text-align: center;
    }
    .menu_bar{
        width: 100%;
        padding-left: 76px;
    }
    /* //header */
    /* footer */
    .footer_L{
        width: 100%;
        text-align: center;
    }
    .footer_R{
        width: 100%;
    }
    .fright{
        width: 100%;
        text-align: center;
    }
    .footer_menu{
        width: 100%;
        padding-left: 98px;
    }
    /* //footer */
} 
</style>
</head>
<body>
<!--header-->
    <div class="header">
    	<div class="wrap">
            <nav class="main_menu container">
                <div class="menu_img">
                    <img src="img/c32fe01ca96fce6014427edc4656fe1d.png">
                </div>
                <div class="menu_login">
                    <form class="form-inline">
                        <div class="form-group">
                            <label class="sr-only" for="exampleInputEmail3">id</label>
                            <input type="email" class="form-control input_box" placeholder="Enter ID">
                        </div>
                        <div class="form-group">
                            <label class="sr-only" for="exampleInputPassword3">password</label>
                            <input type="password" class="form-control input_box" placeholder="Password">
                        </div>
                        <button type="submit" class="btn send_btn"><span class="main_font">로그인</span></button>
                    </form>
                </div>
                <div class="menu_bar">
                    <ul class="nav">
                      <li class="current"><a href="index.html">Home</a></li>
                      <li><a href="about.html">About</a></li>
                      <li class="top-menu"><a href="javascript:{}">Features</a>
                          <ul class="sub-menu">
                              <li><a href="scaffolding.html">Scaffolding</a></li>
                              <li><a href="typography.html">Typography</a></li>
                              <li><a href="shortcodes.html">Shortcodes</a></li>
                              <li><a href="tables.html">Tables</a></li>
                          </ul>
                      </li>
                      <li class="top-menu"><a href="javascript:{}">Portfolio</a>
                           <ul class="sub-menu">
                              <li><a href="portfolio_2columns.html">2 Columns</a></li>
                              <li><a href="portfolio_3columns.html">3 Columns</a></li>
                              <li><a href="portfolio_4columns.html">4 Columns</a></li>
                          </ul>
                      </li>                                  
                      <li class="top-menu"><a href="javascript:{}">Blog</a>
                           <ul class="sub-menu">
                              <li><a href="blog.html">Blog with right sidebar</a></li>
                              <li><a href="blog_post.html">Blog post</a></li>
                          </ul>
                      </li>
                      <li><a href="contacts.html">Contacts</a></li>
                    </ul>
                </div>
             </nav>                
             
        </div>    
    </div>
    <!--//header-->    
     
    <!-- main contents -->
    <div class="page_container">
        <!--slider-->
        <div id="main_slider">
            <div class="camera_wrap" id="camera_wrap_1">
                <div data-src="img/slider/1.jpg"></div>
                <div data-src="img/slider/2.jpg"></div>
                <div data-src="img/slider/3.jpg"></div>                                        
            </div><!-- #camera_wrap_1 -->
            <div class="clear"></div>	
        </div>        
        <!--//slider-->

       
    </div>
    <!-- //main contents -->

    <!--footer-->
    <div id="footer">

        <div class="footer">
            <div class="wrap">
            	<div class="container">
                	<div class="row">
                		<div class="footer_L">
                        	<div class="foot_logo"><a href="index.html"><img src="img/footer_logo.png" alt="" /></a></div>
                        	<div class="copyright">&copy; 2020 Jessica White. Professional Fashion Photography. All Rights Reserved.</div>                        
                        </div>
                        <div class="footer_R">
                            <div class="fright">
                                <form action="#" method="post">
                                    <input class="inp_search" name="name" type="text" value="   Search the Site" onfocus="if (this.value == 'Search the Site') this.value = '';" onblur="if (this.value == '') this.value = 'Search the Site';" />
                                </form>
                            </div>
                            <div class="footer_menu">
                                <ul class="nav">
                                    <li><a href="index.html" class="current">Home</a></li>
                                    <li><a href="about.html">About</a></li>
                                    <li><a href="scaffolding.html">features</a></li>
                                    <li><a href="portfolio_2columns.html">Portfolio</a></li>
                                    <li><a href="blog.html">Blog</a></li>
                                    <li><a href="contacts.html">Contacts</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--//footer-->    

</body>
</html>