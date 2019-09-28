<%-- 
    Document   : welcomepage
    Created on : Aug 27, 2019, 3:57:08 AM
    Author     : Kate Dianne
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">

<head>
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>SB Admin 2 - Blank</title>

  <!-- Custom fonts for this template-->
  <link href="${contextPath}/resources/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="${contextPath}/resources/css/font.css" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="${contextPath}/resources/css/custom.css" rel="stylesheet">
  <link href="${contextPath}/resources/css/sb-admin-2.min.css" rel="stylesheet">
  <link href="${contextPath}/resources/css/styles.css" rel="stylesheet">
  <link href="${contextPath}/resources/css/jquery.bracket.min.css" rel="stylesheet">
  <script src="${contextPath}/resources/js/jquery-3.4.1.min.js"></script>
  <script src="${contextPath}/resources/js/points.js"></script>
  <script src="${contextPath}/resources/js/jquery.bracket.min.js"></script>
</head>

<body id="page-top">

  <!-- Page Wrapper -->
  <div id="wrapper">

    <!-- Sidebar -->
    <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion point-system" id="accordionSidebar" style="margin:0px;">

        <!-- Sidebar - Brand -->
      <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.html">
        <div class="sidebar-brand-icon rotate-n-15">
          <i class="fas fa-laugh-wink"></i>
        </div>
        <div class="sidebar-brand-text mx-3">Points System</div>
      </a>
      <!-- Divider -->
       <hr class="sidebar-divider my-0"> 

<!--       Nav Item - Dashboard 
      <li class="nav-item">
        <a class="nav-link" href="index.html">
          <i class="fas fa-fw fa-tachometer-alt"></i>
          <span>Dashboard</span></a>
      </li>

       Divider 
      <hr class="sidebar-divider">-->

      <!-- Heading -->
      <div class="sidebar-heading">
        Interface
      </div>

      <!-- Nav Item - Pages Collapse Menu -->
      <li class="nav-item">
        <a class="nav-link collapsed" href="${contextPath}/participants">
            <i class="fas fa-fw fa-users"></i>
          <span>Participants</span>
        </a>
      </li>

      <!-- Nav Item - Utilities Collapse Menu -->
      <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities"
          aria-expanded="true" aria-controls="collapseUtilities">
          <i class="fas fa-fw fa-cog"></i>
          <span>Event Name</span>
        </a>
        <div id="collapseUtilities" class="collapse" aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
          <div class="bg-white py-2 collapse-inner rounded">
            <a class="collapse-item category-a">
              <div><input type="text" class="category-name" style="width:100px"></input><button
                  class="btn btn-primary add-category" style="margin-left:5px" href="#">+</button></div>
            </a>
            <!-- <a class="collapse-item" href="blank.html">Prelims</a>
            <a class="collapse-item" href="blank.html">Semifinals</a>
            <a class="collapse-item" href="blank.html">Finals</a> -->
          </div>
        </div>
      </li>

      <li class="nav-item">
        <a class="nav-link collapsed" href="jsp/removecategory.jsp">
          <i class="fas fa-fw fa-trash"></i>
          <span>Categories</span>
        </a>
      </li>


      <!-- Sidebar Toggler (Sidebar) -->
      <div class="text-center d-none d-md-inline">
        <button class="rounded-circle border-0" id="sidebarToggle"></button>
      </div>

    </ul>
    <!-- End of Sidebar -->

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

      <!-- Main Content -->
      <div id="content">

        <div class="note">
          <p>
              Welcome ${firstname} ${lastname}!
          </p>
        </div>

        <div class="choices">
          <div class="container register-form">
            <div class="form row">

              <div class="col-md-5">
                <div class="dropdown dropdown-choice">
                  <a href="#" class="btn dropdown-toggle" data-toggle="dropdown">
                    <span class="choice-title">Add Scoreboard</span>
                    <b class="caret"></b>
                  </a>
                  <span class="scoreboard-choice"></span>
                  <ul class="dropdown-menu">
                    <button class="dropdown-item scoreboard" type="button">Bracket Tournament</button>
                    <button class="dropdown-item scoreboard" type="button">Points System</button>
                </div>
                </ul>
              </div>


              <div class="col-md-5 bracket-divs">

              </div>

              <div class="col-md-2">
                <div class="dropdown dropdown-choice">
                  <a href="#" class="btn dropdown-toggle" data-toggle="dropdown">
                    <span class="choice-title">My Scoreboard</span>
                    <b class="caret"></b>
                  </a>
                  <ul class="dropdown-menu">
                    <button class="dropdown-item" type="button">Saved Scoreboard1</button>
                    <button class="dropdown-item" type="button">Saved Scoreboard2</button>
                    <button class="dropdown-item" type="button">Saved Scoreboard3</button>
                    <button class="dropdown-item" type="button">Saved Scoreboard4</button>
                    <button class="dropdown-item" type="button">Saved Scoreboard5</button>
                  </ul>
                </div>
              </div>
            </div>

          </div>
        </div>

        <!-- Begin Page Content -->
        <div class="container-fluid">

          <!-- Page Heading -->
          <div class="container">

              <div class="bracket-system">
                <div class="card shadow mb-4 bracket-system-body">
                    <div class="card-body">
                        <div class="tournament"></div>
                      </div>
                </div>
              </div>
            
            <div class="point-system">
            <h3><input type="text" placeholder="Event Name"></input>
              <a href="#" class="btn btn-success btn-circle btn-sm">
                <i class="fas fa-check"></i>
              </a>
            </h3>
            <div class="mainmenu">
            <ul class="nav nav-tabs"></ul>
              <li class="dropdown active">
                <a class="dropdown-toggle menu-dropdown" id="Mainmenu" data-toggle="dropdown" href="#">Menu</a>
                
                <ul class="dropdown-menu ul-menu1">
                  <li>
                    <input type="text" class="input-menu1" style="width: 100px; margin-left:10px"></input>
                    <button class="btn btn-primary btn-menu1" style="margin-left:5px" href="#">+</button>
                  </li>
                  <!-- <li><a href="#">Menu 1</a></li>
                  <li><a href="#">Menu 2</a></li> -->

                </ul>
              </li>
            </div>
              <div class="submenu">
              <li class="dropdown active">
                <a class="dropdown-toggle submenu-dropdown" id="Submenu" data-toggle="dropdown" href="#">Submenu</a>

                <ul class="dropdown-menu ul-submenu1">
                  <li>
                    <input type="text" class="input-submenu1" style="width: 100px; margin-left:10px"></input>
                    <button class="btn btn-primary btn-submenu1" style="margin-left:5px" href="#">+</button>
                  </li>
                  <!-- <li><a href="#">Submenu 1-1</a></li>
                  <li><a href="#">Submenu 1-2</a></li> -->

                </ul>
              </li>
            </div>
            </ul>

            <div class="card shadow mb-4">
              <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">Weight: </h6>
                <input type="number"></input>
                <a href="#" class="btn btn-success btn-circle btn-sm">
                  <i class="fas fa-check"></i>
                </a>

              </div>
              <div class="card-body">
                <div class="table-responsive">
                  <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                    <thead>
                      <tr>
                        <th>Participant</th>
                        <th>Score</th>
                        <th>Final Score</th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <td>Trizzia Loren</td>
                        <td><input type="number"></input></td>
                        <td>90</td>

                      </tr>
                      <tr>
                        <td>Garrett Winters</td>
                        <td><input type="number"></input></td>
                        <td>90</td>

                      </tr>
                      <tr>
                        <td>Ashton Cox</td>
                        <td><input type="number"></input></td>
                        <td>90</td>

                      </tr>
                    </tbody>
                  </table>

                  <input type="button" class="btn btn-success btn-save-points" value="Save">
                  <input type="button" class="btn btn-warning btn-edit-points" value="Edit"> 
                </div>
              </div>
            </div>
          </div>
          </div>
        </div>
        <!-- /.container-fluid -->

      </div>
      <!-- End of Main Content -->

      <!-- Footer -->
      <footer class="sticky-footer bg-white">
        <div class="container my-auto">
          <div class="copyright text-center my-auto">
            <span>Copyright &copy; Your Website 2019</span>
          </div>
        </div>
      </footer>
      <!-- End of Footer -->

    </div>
    <!-- End of Content Wrapper -->

  </div>
  <!-- End of Page Wrapper -->

  <!-- Scroll to Top Button-->
  <a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
  </a>

  <!-- Logout Modal-->
  <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
    aria-hidden="true">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
          <button class="close" type="button" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">×</span>
          </button>
        </div>
        <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
        <div class="modal-footer">
          <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
          <a class="btn btn-primary" href="login.html">Logout</a>
        </div>
      </div>
    </div>
  </div>

  <!-- Bootstrap core JavaScript-->
  <script src="${contextPath}/resources/js/jquery.min.js"></script>
  <script src="${contextPath}/resources/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="${contextPath}/resources/js/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="${contextPath}/resources/js/sb-admin-2.min.js"></script>
  <script src="${contextPath}/resources/js/script.js"></script>
</body>

</html>