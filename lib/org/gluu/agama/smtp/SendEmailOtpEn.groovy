package org.gluu.agama.smtp

class SendEmailOtpEn {

    static String getTemplate(String givenName, String otpCode) {
        return """
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Email Verification</title>
</head>
<body style="font-family: Arial, sans-serif; background-color: #f8f8f8; margin: 0; padding: 0;">
    <table align="center" width="600" style="background-color: #ffffff; padding: 20px; border-collapse: collapse; border-radius: 6px;">
        <tr>
            <td align="center" style="padding: 10px 0;">
                <img src="https://storage.googleapis.com/email_template_staticfiles/Phi_logo320x132_Aug2024.png" width="160" alt="Phi Logo" style="border:none;">
            </td>
        </tr>
        <tr>
            <td style="border-top: 1px solid #e0e0e0; padding-top: 20px;">
                <p style="font-size: 18px; font-weight: bold; margin: 0;">Dear ${givenName},</p>
                <p style="font-size: 16px; color: #555; margin: 10px 0;">
                    Enter the 6-digit code below to verify your email address.
                </p>
                <p style="background-color: #f2f2f2; font-size: 28px; font-weight: bold; letter-spacing: 4px; text-align: center; padding: 15px; border-radius: 6px;">
                    ${otpCode}
                </p>
                <p style="font-size: 14px; color: #777; margin: 15px 0;">
                    If you did not make this request, you can safely ignore this email.
                </p>
                <p style="font-size: 14px; color: #555; margin: 0;">
                    Thanks for helping us keep your account secure.<br>
                    <b>Team Phi Wallet</b>
                </p>
            </td>
        </tr>
    </table>
</body>
</html>
"""
    }
}
