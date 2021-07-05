```startuml
@startuml

entity "購入テーブル" as purchase <d_purchase>
<<M,MASTER_MARK_COLOR>> {
+ order_id[PK]
--
customer_code
purchase_date
total_price
}

entity "購入詳細テーブル" as d_purchase_detail <d_purchase_detail>
<<M,MASTER_MARK_COLOR>> {
+ order_id [PK][NN][FK]
+ detail_id [PK]
--
item_code
price
num
}
@enduml
```
