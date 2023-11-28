# 電卓プログラムの実装

## 目的
簡単な四則演算を行えるようにすること、実装を通してJavaの知識を深めること

## 解説

### インスタンスの設定

Mainクラスで宣言したインスタンスの目的は以下の通りである。

- num1,num2 : 計算で使用する数値をもつ変数
- ope : 四則演算の値を持つ変数
- answer : 計算結果をもつ変数

### nextDouble,nextLineとは

両者ともScannerクラスのメソッドである。違いは以下の通りである。

####  nextDouble

```
 System.out.println("num1に数字を入力");
      double input = new java.util.Scanner(System.in).nextDouble();
```

上記ではScannerを使用してユーザーからの入力を受け取り、nextDouble()メソッドを呼び出し、その入力をdouble型に変更して変数numに読み込んでいる。

#### nextLine

```
 System.out.println("+,-,*,/を入力");
      String inope = new java.util.Scanner(System.in).nextLine();
```

nextDoubleのようにユーザーからの入力を受け取るが、nextLineは文字列に変換している。

### try-catchブロック

```
try {
    // 例外が発生する可能性のあるコード
} catch (例外の種類1 変数名1) {
```

これはプログラムで例外を処理するための構文である。
プログラムが実行される過程で予期せぬエラーが発生した場合、これをキャッチし適切な処理をするための処理

