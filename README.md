# Projeto
This project was created with purpose to show a way to implement an application that interact different types of databases.
Here is just implemented a PoC (proof of concept), described in documentation like `Charlie application`


## Charlie application
To use the services in Charlie application, you have two ways:
* Locally: download this project, open and start in an IDE of your preference.
* Via web: get below the request that you want. Change `http://localhost:8080` to `https://projeto-sw.herokuapp.com`.
  
After, send the request like you prefer (via command-line or using an app like Postman)

To do a new movimentation, use the following curl.
```
curl --request POST \
  --url http://localhost:8080/new_movimentation \
  --header 'Content-Type: application/json' \
  --data '{
	"personID": "12345678909",
	"originalCompany": "Bank A",
	"receivingCompany": "Bank B",
	"date": "2021-05-21T12:00:00-03:00",
	"value": 10.00,
	"type":  "CREDIT_CARD"
}'
```
> **Note**: the possible types of 'type' is: CREDIT_CARD, DEBIT_CARD, TRANFER 

To get the last search that client did about his data, use the following curl.
```
curl --request GET \
  --url 'http://localhost:8080/last/search?personID=12345678909'
```

To get all client's movimentations, use the following curl.
```
curl --request GET \
  --url 'http://localhost:8080/movimentations?personID=12345678909'
```
If you want to get a smaller quantity, you can put `/10` or `/100` in the end of url to get 10 or 100 movimentations, respectively.
