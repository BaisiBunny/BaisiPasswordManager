package tech.baisi.web.passwordmanager;

public class HtmlStrings {
    public static String beforeItem = "<html>\n" +
            "    <head>\n" +
            "        <meta charset=\"UTF-8\">\n" +
            "        <link rel=\"icon\" href=\"https://main.download.baisi.tech/BaisiImgColor4_SemiBold.ico\">\n" +
            "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
            "        <title>测试标题</title>\n" +
            "        <style>\n" +
            "            body{\n" +
            "                margin: 0;\n" +
            "            }\n" +
            "            .head-box{\n" +
            "                display: flex;\n" +
            "                margin: 20px;\n" +
            "                padding: 10px;\n" +
            "                background-color: #74d9c9;\n" +
            "                border-radius: 30px;\n" +
            "            }\n" +
            "            .box{\n" +
            "                display: flex;\n" +
            "                flex-flow: row wrap;\n" +
            "                justify-content: flex-start;\n" +
            "                margin: 20px;\n" +
            "                background-color: #74d9c9;\n" +
            "                padding: 10px;\n" +
            "                border-radius: 30px;\n" +
            "            }\n" +
            "            .item{\n" +
            "                margin: 10px;\n" +
            "                background-color: #ffffff;\n" +
            "                padding: 10px;\n" +
            "                border-radius: 10px;\n" +
            "                flex-grow: 1;\n" +
            "            }\n" +
            "            .item_head{\n" +
            "                margin: 10px;\n" +
            "                background-color: #ffffff;\n" +
            "                padding: 10px;\n" +
            "                border-radius: 10px;\n" +
            "                flex-grow: 1;\n" +
            "            }\n" +
            "            .item:hover{\n" +
            "                background-color: #74d9c9;\n" +
            "            }\n" +
            "            .input-box{\n" +
            "                width: calc(100% - 6px);\n" +
            "                border-width: 2px;\n" +
            "                border-style: solid;\n" +
            "                border-color:#74d9c9;\n" +
            "                border-radius: 5px;\n" +
            "                margin: 3px;\n" +
            "            }\n" +
            "            .white{\n" +
            "                color: #ffffff;\n" +
            "            }\n" +
            "        </style>\n" +
            "    </head>\n" +
            "\n" +
            "    <body>\n" +
            "        <div class=\"head-box\">\n" +
            "            <form class=\"item_head\" method=\"post\">\n" +
            "                <input type=\"text\" name=\"l1\" class=\"input-box\" autocomplete=\"off\"><br>\n" +
            "                <input type=\"text\" name=\"l2\" class=\"input-box\" autocomplete=\"off\"><br>\n" +
            "                <input type=\"text\" name=\"l3\" class=\"input-box\" autocomplete=\"off\"><br>\n" +
            "                <input type=\"submit\" value=\"保存\" class=\"input-box\" style=\"background-color: #74d9c9;color: #ffffff;\">\n" +
            "            </form>\n" +
            "            <form class=\"item_head\" method=\"post\">\n" +
            "                <input type=\"text\" name=\"rm\" class=\"input-box\" autocomplete=\"off\"><br>\n" +
            "                <input type=\"submit\" value=\"删除\" class=\"input-box\" style=\"background-color: #74d9c9;color: #ffffff;\">\n" +
            "            </form>\n" +
            "        </div>\n" +
            "        <div class=\"box\">";

    public static String afterItem = "        </div>\n" +
            "    </body>\n" +
            "</html>";
}
