import org.scalatra._
import org.eclipse.jetty.servlet.ServletHolder

class Scalatra extends LifeCycle {
  override def init(context: ApplicationContext) {
    context.mount(new BasicAuthExample, "/auth/*")
    context.mount(new CookiesExample, "/cookies-example/*")
    context.mount(new FileUploadExample, "/uploads/*")
    context.mount(new DocumentExample, "/docs/*")
    context.mount(new FilterExample, "/*")
    context.mount(new Servlet30ChatExample, "/chat_30/*")
    context.mount(new TemplateExample, "/*")
    
    /*
    // TODO: make work without web.xml, per servlet init parameters
    val meteor = new ServletHolder(classOf[org.atmosphere.cpr.MeteorServlet])
    meteor.setInitParameter("org.atmosphere.servlet", "org.scalatra.MeteorChatExample")
    meteor.setInitOrder(0)
    context.mount(meteor, "/meteor/*") */
    */
    
  }
}
