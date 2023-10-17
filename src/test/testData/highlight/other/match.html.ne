<% include "path" %>
<% extends "path" if condition %>

<% %>

<% match expression %>
   match expression
<% case condition %>
   case condition
<% case condition %>
   case condition
<% case condition %>
   case condition
<% end match %>
   end case

<% apply upper %>
    This text becomes uppercase
<% end apply %>


My name is <%/* per.name */%> and I am <% per.age %>


<% block content %>
<h1>About page</h1>
<p>
    This is about page
</p>
<% end block %>

<% macro input(name, value='', type='text', size=20) -%>
    <input type="<% type %>"
           name="<% name %>"
           value="<% value|e %>"
           size="<% size %>">
<%- end macro %>

