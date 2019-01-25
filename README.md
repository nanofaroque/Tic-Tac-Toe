# Tic Tac Toe game
This is a demo project for Anaconda purpose. 

### Build and Fire application
```$xslt
$git clone https://github.com/nanofaroque/Tic-Tac-Toe.git
$cd titactoe
$./gradlew build && java -jar ./build/libs/tictoctoe-0.1.0.jar

```
#### Create Game
```aidl
 URL: host+"/api/v1/games"
 METHOD: POST
 REQUEST BODY:
              {  
                 "players":[  
                    {  
                       "name":"Omar",
                       "id":"b088ce8e-ca41-43af-81a9-21460ff01e1f"
                    },
                    {  
                       "name":"Faroque",
                       "id":"d3209d42-5ad0-46fe-a935-4007bf79b6f7"
                    }
                 ]
              }
 
 RESPONSE:
 {
     "gameId": "c1d27312-f0d1-466b-aa28-c6767164977b",
     "players": [
         {
             "name": "Omar",
             "id": "b088ce8e-ca41-43af-81a9-21460ff01e1f"
         },
         {
             "name": "Faroque",
             "id": "d3209d42-5ad0-46fe-a935-4007bf79b6f7"
         }
     ]
 }

```