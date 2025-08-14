package org.gluu.agama.smtp

class SendEmailOtpAr {

    static String getTemplate(String givenName, String otpCode) {
        return """
<!DOCTYPE html>
<html lang="ar" dir="rtl">
<head>
    <meta charset="UTF-8">
    <title>تأكيد البريد الإلكتروني</title>
</head>
<body style="font-family: Arial, sans-serif; background-color: #f8f8f8; margin: 0; padding: 0;">
    <table align="center" width="600" style="background-color: #ffffff; padding: 20px; border-collapse: collapse; border-radius: 6px;">
        <tr>
            <td align="center" style="padding: 10px 0;">
                <img src="https://storage.googleapis.com/email_template_staticfiles/Phi_logo320x132_Aug2024.png" alt="Logo" style="height: 40px;">
            </td>
        </tr>
        <tr>
            <td style="border-top: 1px solid #e0e0e0; padding-top: 20px;">
                <p style="font-size: 18px; font-weight: bold; margin: 0;">مرحباً، ${givenName}</p>
                <p style="font-size: 16px; color: #555; margin: 10px 0;">
                    يرجى إدخال الرمز المكون من 6 أرقام أدناه للتحقق من بريدك الإلكتروني.
                </p>
                <p style="background-color: #f2f2f2; font-size: 28px; font-weight: bold; letter-spacing: 4px; text-align: center; padding: 15px; border-radius: 6px;">
                    ${otpCode}
                </p>
                <p style="font-size: 14px; color: #777; margin: 15px 0;">
                    إذا لم تقدم هذا الطلب، يمكنك تجاهل هذه الرسالة بأمان.
                </p>
                <p style="font-size: 14px; color: #555; margin: 0;">
                    شكراً لمساعدتنا في الحفاظ على أمان حسابك.<br>
                    <b>فريق Phi Wallet</b>
                </p>
            </td>
        </tr>
    </table>
</body>
</html>
"""
    }
}
