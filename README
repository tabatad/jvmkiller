# 概要

簡単にJVMのcoerdumpを作成するツール

# 前提

現時点ではffmを使ったツールしか実装していません。
よって、基本的にはjdk22以降を使うことを想定しています。

# 使い方

1. ffmディレクトリに移動
2. run.shを実行
引数にjdkのディレクトリを指定したらそのjdkを使ってcoredumpを生成します。
指定しなければ環境変数`JAVA_HOME`のjdkを使います。

例
```
# 引数なしならJAVA_HOMEのjdkを使用
$ bash run.sh

# 引数に指定したJDKDIRのjdkを使用
$ bash run.sh $JDKDIR
```

※coredumpが生成される場所は環境に依存します。
