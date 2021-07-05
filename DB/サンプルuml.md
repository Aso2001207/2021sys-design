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
@enduml
```
