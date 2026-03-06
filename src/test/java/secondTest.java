import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class secondTest {
    public void test02() throws InterruptedException {
        // 驱动程序管理的自动化
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();

        // 允许访问所有链接
        options.addArguments("--remote-allow-origins=*");

        // 1.打开浏览器
        WebDriver driver = new EdgeDriver(options);
        Thread.sleep(3000);

        // 2.输入网址
        driver.get("https://www.baidu.com");
        Thread.sleep(3000);

        // 3.找到输入框并输入“迪丽热巴”
        driver.findElement(By.xpath("//*[@id=\"kw\"]")).sendKeys("迪丽热巴");
        Thread.sleep(3000);

        // 4.找到“百度一下”按钮并点击
        driver.findElement(By.xpath("//*[@id=\"su\"]")).click();
        Thread.sleep(3000);

        // 5.关闭浏览器
        driver.quit();
    }

}
