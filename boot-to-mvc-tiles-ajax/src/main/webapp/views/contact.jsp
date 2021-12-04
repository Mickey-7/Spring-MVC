<h2>Contact Here</h2>
<div id="msg"></div>
<form id="contact_form">
    <table>
        <tr>
            <td><label>Name</label></td>
            <td><input type="text" name="name" /></td>
        </tr>
        <tr>
            <td><label>Address</label></td>
            <td><textarea name="address"></textarea></td>
        </tr>
        <tr>
            <td><label>Phone</label></td>
            <td><input type="text" name="phone" /></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Save Contact" /></td>
        </tr>
    </table>
</form>
<script type="text/javascript">
    $(document).ready(function (e) {
        // binded to the form with id="contact_form" above
        $("#contact_form").bind("submit", function (event) {
            event.preventDefault();
            $.ajax({
                url: '/saveContact',     //point to the server-side controller
                dataType: 'html',        //what to expect back from the controller
                cache: false,
                data: $("#contact_form").serialize(),
                type: 'post',
                success: function (response) {
                    // binded to the div with id="msg" above
                    //display success response from the controller
                    $('#msg').html('<span style="color:green;">' + response + '</span>')
                },
                error: function (response) {
                    // binded to the div with id="msg" above
                    //display error response from the controller
                    $('#msg').html('<span style="color:red;">' + response + '</span>')

                }
            })
        })
    })
</script>