import org.apache.lucene.analysis.cn.smart.HMMChineseTokenizer;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Main {
  public static void main(String[] args) throws IOException {
    HMMChineseTokenizer chinese = new HMMChineseTokenizer();
    Reader input = new StringReader("帝斯曼上海晶泰晶体");
    chinese.setReader(input);
    chinese.reset();
    while (chinese.incrementToken())
      System.out.println(chinese.cloneAttributes());
    chinese.end();
  }
}
