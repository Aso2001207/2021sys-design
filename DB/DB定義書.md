# DB定義書

## ER図
[ER図はこちら](https://github.com/Aso2001207/2021sys-design/blob/main/DB/%E3%82%B5%E3%83%B3%E3%83%97%E3%83%ABuml.md)

# DBテーブルカラム詳細一覧

## 購入テーブルd_purchase
|和名|属性|型|PK|NN|FK|
|----|---|--|--|--|---|
|オーダーid|order_id|bigint(20)|〇|〇||
|顧客コード|customer_code|varchar(50)||〇||
|購入日|purchase_date|date||〇||
|総額|total_price|int(11)||〇||


## 購入詳細テーブルd_purchase_datail
|和名|属性名|型|PK|NN|FK|
|----|-----|--|--|--|--|
|オーダー詳細ID|detail_id|bigint(20)|〇|〇||
|商品コード|order_id|bigint(20)|〇|〇|〇|
|商品コード|item_code|int(11)||〇||
|価格|price|int(11)||〇||
|数量|num|int(11)||〇||

## 顧客マスタm_customers
|和名|属性名|型|PK|NN|FK|
|----|-----|--|--|--|--|
|顧客コード|customer_id|varchar(50)|〇|〇||
|パスワード|pass|varchar(50)|〇|〇|〇|
|氏名|name|varchar(50)||〇||
|住所|adress|varchar(50)||〇||
|電話番号|tel|varchar(50)||〇||
|メールアドレス|mail|varchar(50)||〇||
|削除フラグ|del_fiag|int(11)||||
|登録日|reg_date|date||〇||

## m_category
|属性名|型|PK|NN|FK|
|-----|--|--|--|--|
|category_id|int(11)|〇|〇||
|name|varchar(20)||〇||
|teg_date|date||〇||


## m_items
|属性名|型|PK|NN|FK|
|-----|--|--|--|--|
|item_code|int(11)|〇|〇||
|item_name|varchar(50)||〇||
|price|int(11)||〇||
|category_id|int(11)||〇|〇|
|image|varchar(200)||〇||
|detail|varchar(500)||||
|del_flag|int(11)||||
|reg_date|date||〇||


