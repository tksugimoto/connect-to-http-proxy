import org.scalatest._

class MainSpec extends WordSpecLike with Matchers {
  "プロキシ成功で正常終了する" in {
    val exitStatus = 0
    ???
  }

  "プロキシサーバーを名前解決できない場合異常終了する" in {
    val exitStatus = 1
    ???
  }

  "プロキシサーバーにつながらない場合異常終了する" in {
    val exitStatus = 1
    ???
  }

  "プロキシサーバーではない場合異常終了する" in {
    val exitStatus = 1
    ???
  }

  "接続先がない場合異常終了する" in {
    val exitStatus = 1
    ???
  }
}
