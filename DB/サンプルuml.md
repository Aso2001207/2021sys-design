```startuml
@startuml
!define MASTER_MARK_COLOR Orange 
!define TRANSACTION_MARK_COLOR DeepSkyBlue

'グラデーションさせる場合 #xx-xx
!define MAIN_ENTITY #MintCream-MistyRose

/'
  デフォルト色を"skinparam class"で設定します。
'/
skinparam class {
    '図の背景
    BackgroundColor Snow
    '図の枠
    BorderColor Black
    'リレーションの色
    ArrowColor Black
}

package "ECサイト" as target_system {

 





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
+ order_id [PK]
+ detail_id [PK]
--
item_code
price
num
}
}

@enduml
```
