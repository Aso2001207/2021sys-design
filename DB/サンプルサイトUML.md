```startuml
@startuml erd

購入テーブル }o--o| 顧客マスタ
購入詳細テーブル }|--|| 購入テーブル
商品マスタ }o--|| カテゴリマスタ
@enduml
```
