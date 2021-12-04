<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

    <html>

    <head>
        <title>
            <tiles:getAsString name="title" />
            <!-- equivalent to Roy Tutorials homepage on tiles.xml -->
        </title>
        <!-- for ajax -->
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    </head>

    <body>
        <table>
            <tr>
                <td colspan="2">
                    <tiles:insertAttribute name="header" />
                </td>
            </tr>
            <tr>
                <td>
                    <tiles:insertAttribute name="menu" />
                </td>
                <td>
                    <tiles:insertAttribute name="body" />
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <tiles:insertAttribute name="footer" />
                </td>
            </tr>
        </table>
    </body>

    </html>