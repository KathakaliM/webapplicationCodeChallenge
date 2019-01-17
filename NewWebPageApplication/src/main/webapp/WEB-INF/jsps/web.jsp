<%@page import="org.springframework.boot.security.reactive.ApplicationContextServerWebExchangeMatcher"%>
<%@ page import="java.io.*,java.util.*" %>
<html>
    <head>
        
    </head>
    <body>
        <form>
            <fieldset style="width:20%; background-color:#e6ffe6;">
                
                <%
                    Integer hitCount = 
                    (Integer)application.getAttribute("hitCounter");
                
                    if( hitCount ==null || hitCount == 0 )
                    {
                        /* First visit */
                        out.println("Hi!!");
                        hitCount = 1;
                    }
                    else
                    {
                        /* return visit */
                        out.println("Hi!!");
                        hitCount += 1;
                    }
                    application.setAttribute("hitCounter", hitCount);
                %>
                <p>You are the <%= hitCount%> visitor</p>
            </fieldset>
        </form>
    </body>
</html>