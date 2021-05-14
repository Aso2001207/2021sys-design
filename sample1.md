```uml
@startuml
ユーザー -> webサーバー :商品検索
webサーバー -> DB :商品検索
DB -> DB :検索処理
DB -> webサーバー :商品検索結果
webサーバー -> ユーザー :商品検索結果
@enduml
