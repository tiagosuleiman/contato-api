===================================================
# contato-api
===================================================

### REQUEST :: GET :: https://awts-contato-api.herokuapp.com/contatos

### REQUEST :: POST :: BODY :: RAW :: JSON :: https://awts-contato-api.herokuapp.com/contatos 

{
	"nome": "Tiago Suleiman",
	"email": "suleiman@email.com" 
}

===================================================
# GIT: create new repository
===================================================
in page: create new repository

in folder project:
in terminal:

  >> echo "# contato-api" >> README.md
  
  >> git add README.md
  
  >> git add .
  
  >> git commit -m "project contato-api"
  
  >> git remote add origin https://github.com/tiagosuleiman/contato-api.git
  
  >> git push -u origin master
   
===================================================
# Config Heroku deploy
===================================================
install heroku cli: sudo npm install -g heroku
  heroku login

in terminal:

 >> git clone https://github.com/tiagosuleiman/springboot
 
 >> heroku create awts-contato-api
 
 >> git push heroku master (já faz o deploy)
    remote: -----> Launching...
    remote:        Released v5
    remote:        https://awts-contato-api.herokuapp.com/ deployed to Heroku
 
 >> heroku logs --tail

 >> heroku addons:create heroku-postgresql:hobby-dev
 
===================================================