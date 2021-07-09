```startuml
@startuml



 entity "購入テーブル" as purchase <d_purchase>
 {
+ order_id[PK]
--
customer_code
purchase_date
total_price
}
entity "購入詳細テーブル" as d_purchase_detail <d_purchase_detail>
{
+ order_id [PK]
+ detail_id [PK]
--
item_code
price
num
}



@enduml
```
