```
@startuml
お客　-> ホール係:Request
ホール係 --> 厨房:Request
厨房　--> ホール係:Request
ホール係　--> お客:Request
@enduml
```
