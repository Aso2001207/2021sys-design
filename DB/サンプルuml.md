```startuml
@startuml

/'
  図の中で目立たせたいエンティティに着色するための
  色の名前（定数）を定義できます。
  ↓色のサンプル↓
  https://github.com/shibakay/2021sys-design/blob/main/color.md
'/

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
    /'
      マスターテーブルを M、トランザクションを T などで表記
      １文字なら "主" とか "従" まど日本語でも記載可能
     '/



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
