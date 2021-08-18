# はじめに
大阪大学駒谷研究室が開発中の音声対話システムのうち，CommUを制御するサーバーおよびプロキシプログラムである．
プロキシプログラムは対話制御プログラムから与えられたメッセージを処理し，CommUへ動作命令を送る．
サーバープログラムはCommU上で動作し，モーションの制御を行う．

サーバープログラムはJavaで，プロキシプログラムはPythonでそれぞれ書かれている．

# 開発環境
- OS: Ubuntu 18.04 LTS
- CommU-NS: 1.26.2
- Java: 1.8.0_40
- Python: 3.7.11
- Vstone Magic: 1.0.6390.17171

# 導入方法
## 1. JavaおよびPythonの導入
CommU本体にJava，プロキシサーバーにPythonを導入する．
基本的にJavaはCommUに初期から導入されている．
## 2. サーバープログラムの導入
/serverの内容をCommU本体の適当な位置に転送する．

## 3. プロキシプログラムの導入
プロキシプログラム内のbehavior.jsonにVstone Magicで作成したモーションファイル(.java)のCommU内でのディレクトリを記載．

新しくモーションファイルを追加しない場合は編集不要．


# 実行方法

## 1. サーバープログラムの実行方法
以下のコマンドでサーバーを立ち上げることができる．
```shellscript
$ sh java_run.bash (使用したいport番号)
```
## 2. プロキシプログラムの実行方法
start_proxy.shの各項目を編集し，下記コマンドを実行．
```shellscript
$ sh start_proxy.sh
```

テスト用クライアントプログラムも同様に下記コマンドで実行．
```shellscript
$ sh start_client.sh
```

任意のメッセージをクライアントから送信すると，プロキシが受け取り，
メッセージを形成した後にサーバーへ転送する．

(メッセージの例)
```shellscript
$ {"playmotion":"greeting"}
```
## 編集項目

### start_proxy.sh
- IP_CommU: CommU本体のIPアドレス
- port_CommU: CommU本体のポート番号
- IP_server: 本プログラムを実行するマシンのIPアドレス
- port_server: 本プログラムを実行するマシンのポート番号
- send_message: {True, False} 動作命令送信後にクライアントにメッセージを返送するかのオプション

クライアントにて
```shellscript
{"(メッセージタイプ)":"(バリュー)"}
```
とjson形式でメッセージを送ると，対応する動作を行う．

現時点では"playmotion"メッセージタイプに対応

# 対応メッセージ
## playmotion
behavior.jsonに記されたバリューに対応する動作を実行する．Vstone Magicで.javaファイルを作成し，behavior.jsonを編集することで新しい動作の追加が可能

