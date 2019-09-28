<%-- 
    Document   : removecategory
    Created on : Sep 1, 2019, 7:27:25 PM
    Author     : Kate Dianne
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
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
  <link href="${contextPath}/resources/css/styles.css" rel="stylesheet">
  <link href="${contextPath}/resources/css/sb-admin-2.min.css" rel="stylesheet">
  
  <script src="${contextPath}/resources/js/points.js"></script>
  

</head>

<body id="page-top">

  <!-- Page Wrapper -->
  <div id="wrapper">

    <!-- Sidebar -->
    <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar" style="margin:0px">

      <!-- Sidebar - Brand -->
      <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.html">
        <div class="sidebar-brand-icon rotate-n-15">
          <i class="fas fa-laugh-wink"></i>
        </div>
        <div class="sidebar-brand-text mx-3">Points System</div>
      </a>

      <!-- Divider -->
      <hr class="sidebar-divider">

      
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
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities" aria-expanded="true" aria-controls="collapseUtilities">
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
        <a class="nav-link collapsed" href="removecategory.jsp">
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

        <!-- Topbar -->
        <div class="note">
          <p>Categories</p>
        
        
        </div>
        <!-- End of Topbar -->

        <!-- Begin Page Content -->
        <div class="container-fluid">
			
			
		  
          <!-- Page Heading -->
          <div class="container">
		  <div class="card shadow mb-4">
            <div class="card-header py-3">
			  
            </div>
			
            <div class="card-body">
			<div class="row">
				<div class="col-sm-12 col-md-6">
					<div class="dataTables_length" id="dataTable_length">
						<label>Show <select name="dataTable_length" aria-controls="dataTable" class="custom-select custom-select-sm form-control form-control-sm"><option value="10">10</option><option value="25">25</option><option value="50">50</option><option value="100">100</option></select>
						</label>
					</div>
				</div>
				<div class="col-sm-12 col-md-6">
					<div id="dataTable_filter" class="dataTables_filter">
					<label>Search:<input type="search" class="form-control form-control-sm" placeholder="" aria-controls="dataTable"></label>
					</div>
				</div>
			</div>
              <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                  <thead>
                    <tr>
                      <th>Level</th>
                      <th>Category</th>
                      <th></th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <td>1</td>
                      <td>Prelims</td>
                      <td>
						  <a href="#" class="btn btn-danger btn-sm">
							<i class="fas fa-trash"></i>
						  </a>
						  <a href="#" class="btn btn-success btn-sm">
							<i class="fas  fa-cog"></i>
						  </a>
					  </td>
                      
                    </tr>
                    <tr>
                      <td>2</td>
                      <td>Semifinals</td>
                      <td>
						<a href="#" class="btn btn-danger btn-sm">
							<i class="fas fa-trash"></i>
						  </a>
						  <a href="#" class="btn btn-success btn-sm">
							<i class="fas  fa-cog"></i>
						  </a>
					  </td>
                      
                    </tr>
                    <tr>
                      <td>3</td>
                      <td>Finals</td>
                      <td>
						<a href="#" class="btn btn-danger btn-sm">
							<i class="fas fa-trash"></i>
						  </a>
						  <a href="#" class="btn btn-success btn-sm">
							<i class="fas  fa-cog"></i>
						  </a>
					  </td>
                    </tr>
					
                  </tbody>
                </table>
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
  <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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

</body>

</html>