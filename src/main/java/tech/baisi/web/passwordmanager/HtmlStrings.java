package tech.baisi.web.passwordmanager;

public class HtmlStrings {
    public static String beforeItem = """
            <html>
                <head>
                    <meta charset="UTF-8">
                    <link rel="icon" href="BaisiImgAt_SemiBold.ico">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <title>测试标题</title>
                    <style>
                        body{
                            margin: 0;
                            font-family: Arial, Helvetica, sans-serif;
                        }
                        .head-box{
                            display: flex;
                            margin: 20px;
                            padding: 10px;
                            background-color: #74d9c9;
                            border-radius: 30px;
                        }
                        .box{
                            display: flex;
                            flex-flow: row wrap;
                            justify-content: flex-start;
                            margin: 20px;
                            background-color: #74d9c9;
                            padding: 10px;
                            border-radius: 30px;
                        }
                        .item{
                            margin: 10px;
                            background-color: #ffffff;
                            padding: 10px;
                            border-radius: 10px;
                            flex-grow: 1;
                        }
                        .item_head{
                            margin: 10px;
                            background-color: #ffffff;
                            padding: 10px;
                            border-radius: 10px;
                            flex-grow: 1;
                        }
                        .item:hover{
                            background-color: #74d9c9;
                        }
                        .input-box{
                            width: calc(100% - 6px);
                            border-width: 2px;
                            border-style: solid;
                            border-color:#74d9c9;
                            border-radius: 5px;
                            margin: 3px;
                        }
                        .white{
                            color: #ffffff;
                        }
                    </style>
                </head>
                        
                <body>
                    <div class="head-box">
                        <form class="item_head" method="post">
                            <input type="text" name="l1" class="input-box" autocomplete="off"><br>
                            <input type="text" name="l2" class="input-box" autocomplete="off"><br>
                            <input type="text" name="l3" class="input-box" autocomplete="off"><br>
                            <input type="submit" value="保存" class="input-box" style="background-color: #74d9c9;color: #ffffff;">
                        </form>
                        <form class="item_head" method="post">
                            <input type="text" name="rm" class="input-box" autocomplete="off"><br>
                            <input type="submit" value="删除" class="input-box" style="background-color: #74d9c9;color: #ffffff;">
                        </form>
                    </div>
                    <div class="box">""";

    public static String afterItem = """
                    </div>
                </body>
            </html>""";
}
