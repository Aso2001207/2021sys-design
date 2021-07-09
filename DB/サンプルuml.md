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
+ order_id [PK][NN][FK]
+ detail_id [PK]
--
item_code
price
num
}

entity "顧客マスタ" as m_customers <m_customers>{
+ customaer_code [PK][NN]
--
pass
name
address
tel
mail
del_flag
reg_date
}
entity "カテゴリマスタ" as m_category <m_category>
+ category_id[PK]
--
name
reg_date
}



@enduml
```
