<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>课堂练习1</title>
</head>
<body>
    <div class="container">
        <header>
            <h1>课堂练习1</h1>
        </header>
        
        <div class="content">
            <section class="problem-section">
                <h2>问题描述</h2>
                <p>设计一个Java程序，显示一个字符串"I Love Java"</p>
                <p><strong>输入形式：</strong>无</p>
                <p><strong>输出形式：</strong>显示一行字符串"I Love Java"</p>
                <p><strong>样例输入：</strong>无</p>
                <p><strong>样例输出：</strong>无</p>
                <p><strong>样例说明：</strong>无</p>
                <p><strong>评分标准：</strong>字符串完全正确得20分</p>
            </section>
            
            <section class="code-section">
                <h2>Java程序代码</h2>
                <pre><code>public class LoveJava {
    public static void main(String[] args) {
        // 显示字符串"I Love Java"
        System.out.println("I Love Java");
    }
}</code></pre>
            </section>
            
            <section class="output-section">
                <h2>程序输出</h2>
                <div class="output-box">
                    I Love Java
                </div>
            </section>
            
            <div class="nav-buttons">
                <a href="#" class="nav-button">上一题</a>
                <a href="#" class="nav-button">下一题</a>
            </div>
        </div>
    </div>

    <script>
        // 添加简单的交互效果
        document.addEventListener('DOMContentLoaded', function() {
            // 为代码区域添加点击复制功能
            const codeBlock = document.querySelector('pre');
            codeBlock.addEventListener('click', function() {
                const range = document.createRange();
                range.selectNode(this);
                window.getSelection().removeAllRanges();
                window.getSelection().addRange(range);
                document.execCommand('copy');
                window.getSelection().removeAllRanges();
                
                // 显示复制成功提示
                const originalText = this.textContent;
                this.textContent = '代码已复制到剪贴板！';
                setTimeout(() => {
                    this.textContent = originalText;
                }, 1500);
            });
            
            // 为导航按钮添加简单动画
            const navButtons = document.querySelectorAll('.nav-button');
            navButtons.forEach(button => {
                button.addEventListener('mouseenter', function() {
                    this.style.transform = 'translateY(-3px)';
                });
                button.addEventListener('mouseleave', function() {
                    this.style.transform = 'translateY(0)';
                });
            });
        });
    </script>
</body>
</html>