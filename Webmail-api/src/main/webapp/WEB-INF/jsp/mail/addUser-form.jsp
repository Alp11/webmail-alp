<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="/mels/bootstrap/css/bootstrap.min.css">
</head>
<body>

<div class="container">
  
  <h2>Ajouter un User</h2>
  <form class="form-horizontal" action="addUser" method="post">
    <div class="form-group">
      <label class="control-label col-sm-2" for="lastName">Nom:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="lastName" name="lastName" placeholder="Saisir le Nom ">
      </div>
    </div>
       
    <div class="form-group">
      <label class="control-label col-sm-2" for="power">Mail</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="power" name="power" placeholder="Saisir force">
      </div>
    </div>
         
    
    <div class="form-group">
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Submit</button>
      </div>
    </div>
    
    <div class="form-group">
      <div class="col-sm-offset-3 col-sm-9">
        <button type="submit" class="btn btn-default">S'inscrire</button>
      </div>
    </div>
     
    </form>
</div>

</body>
</html>

