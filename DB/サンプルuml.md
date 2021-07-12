```startuml
@startuml

package "ECサイト" as target_system {


 entity "購入テーブル" as purchase <d_purchase>
 {
+ order_id[PK]
--
customer_code
purchase_date
total_price
購入テーブル }o--o| 顧客マスタ
}
entity "購入詳細テーブル" as d_purchase_detail <d_purchase_detail>
{
+ order_id [PK][NN][FK]
+ detail_id [PK]
--
item_code
price
num
購入詳細テーブル |}--|| 購入テーブル
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
顧客マスタ |o--o{ 購入テーブル
}
entity "カテゴリマスタ" as m_category <m_category>{
+ category_id[PK][NN]
--
name
reg_date
カテゴリマスタ ||--o{ 商品マスタ
}

entity "商品マスタ" as m_items <m_items>{
+ item_code[PK]
--
item_name
price
category_id
image
detail
del_flag
reg_date
商品マスタ }o--|| カテゴリマスタ

}




 


@enduml
```
