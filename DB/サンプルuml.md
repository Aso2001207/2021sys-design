```startuml
@startuml



 entity "購入テーブル" as purchase <d_purchase>
 {
+ order_id[PK]
--
customer_code[NN]
purchase_date[NN]
total_price[NN]
}
entity "購入詳細テーブル" as d_purchase_detail <d_purchase_detail>
{
+ order_id [PK][NN][FK]
+ detail_id [PK]
--
item_code[NN][FK]
price[NN]
num[NN]
}

entity "顧客マスタ" as m_customers <m_customers>{
+ customaer_code [PK][NN]
--
pass[NN]
name[NN]
address[NN]
tel[NN]
mail[NN]
del_flag
reg_date[NN]
}
entity "カテゴリマスタ" as m_category <m_category>{
+ category_id[PK][NN]
--
name[NN]
reg_date[NN]
}

entity "商品マスタ" as m_items <m_items>{
+ item_code[PK]
--
item_name[NN]
price[NN]
category_id[NN][FK]
image[NN]
detail
del_flag
reg_date[NN]
}
 


@enduml
```
