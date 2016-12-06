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
  
  <h2>Envoyer un mail</h2>
  <form class="form-horizontal" action="envoi" method="post">
    <div class="form-group">
      <label class="control-label col-sm-2" for="lastName">Adresse mail du destinataire</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="lastName" name="lastName" placeholder="Saisir l'adresse mail ">
      </div>
    </div>
   
	<div class="form-group">
      <label class="control-label col-sm-2" for="firstName">Sujet</label>
      <div class="col-sm-10">
        <input path="firstName" type="text" class="form-control" id="firstName" name = "firstName" placeholder="Saisir le sujet">
      </div>
    </div>
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="alias">Text</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name = "alias" id="alias" placeholder="Saisir votre message">
      </div>
    </div>       
    
    <div class="form-group">
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Envoyer</button>
      </div>
    </div>
  </form>
</div>

</body>
</html>

