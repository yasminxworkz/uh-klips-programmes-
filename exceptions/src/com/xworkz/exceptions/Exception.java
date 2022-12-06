package com.xworkz.exceptions;

import java.awt.AWTError;
import java.awt.AWTException;
import java.awt.FontFormatException;
import java.awt.color.ProfileDataException;
import java.awt.datatransfer.MimeTypeParseException;
import java.awt.geom.IllegalPathStateException;
import java.awt.image.ImagingOpException;
import java.beans.PropertyVetoException;
import java.io.IOError;
import java.lang.annotation.AnnotationFormatError;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.UnmodifiableClassException;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.UndeclaredThrowableException;
import java.nio.BufferOverflowException;
import java.nio.channels.AlreadyBoundException;
import java.nio.charset.CoderMalfunctionError;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystemNotFoundException;
import java.rmi.MarshalException;
import java.rmi.activation.ActivationException;
import java.security.GeneralSecurityException;
import java.security.ProviderException;
import java.security.acl.LastOwnerException;
import java.security.acl.NotOwnerException;
import java.security.cert.CertificateException;
import java.util.ConcurrentModificationException;
import java.util.EmptyStackException;
import java.util.IllformedLocaleException;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import java.util.TooManyListenersException;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.prefs.BackingStoreException;
import java.util.prefs.InvalidPreferencesFormatException;
import java.util.zip.DataFormatException;
import java.util.zip.ZipError;

import javax.lang.model.type.MirroredTypeException;
import javax.management.BadAttributeValueExpException;
import javax.management.BadStringOperationException;
import javax.management.JMRuntimeException;
import javax.naming.NamingException;
import javax.print.PrintException;
import javax.script.ScriptException;
import javax.security.auth.DestroyFailedException;
import javax.security.auth.RefreshFailedException;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.text.BadLocationException;
import javax.swing.undo.CannotRedoException;
import javax.transaction.xa.XAException;
import javax.xml.bind.TypeConstraintException;
import javax.xml.crypto.NoSuchMechanismException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.ws.WebServiceException;

import org.ietf.jgss.GSSException;
import org.omg.CORBA.SystemException;
import org.omg.CORBA.UserException;
import org.omg.CORBA.portable.ApplicationException;
import org.omg.CORBA.portable.RemarshalException;
import org.w3c.dom.events.EventException;
import org.w3c.dom.ls.LSException;

import com.sun.java.browser.dom.DOMAccessException;
import com.sun.javafx.geom.transform.NoninvertibleTransformException;
import com.sun.org.apache.xerces.internal.impl.xpath.XPathException;
import com.sun.xml.internal.ws.policy.privateutil.ServiceConfigurationError;
import com.sun.xml.internal.ws.spi.db.DatabindingException;

public class Exception {
	
	public void method1() {
		System.out.println("run time");
		throw new SecurityException();
	}
	

	
	public void method2() {
		System.out.println("run time");
		throw new WebServiceException();
	}
	
	public void method3() {
		System.out.println("run time");
		throw new ArithmeticException();
	}
	
	public void method4() {
		System.out.println("run time");
		throw new ArrayStoreException();
	}
	
	public void method5() {
		System.out.println("run time");
		throw new BufferOverflowException();
	}
	
	public void method6() {
		System.out.println("run time");
		throw new CannotRedoException();
	}
	
	public void method7() {
		System.out.println("run time");
		throw new ClassCastException();
	}
	
	public void method8() {
		System.out.println("run time");
		throw new ConcurrentModificationException();
	}
	
	public void method9() {
		System.out.println("run time");
		throw new DatabindingException();
	}
	
	public void method10() {
		System.out.println("run time");
		throw new EmptyStackException();
	}
	
	public void method11() {
		System.out.println("run time");
		throw new EventException((short) 2, "cgv");
	}
	
	public void method12() {
		System.out.println("run time");
		throw new FileSystemAlreadyExistsException();
	}
	
	public void method13() {
		System.out.println("run time");
		throw new FileSystemNotFoundException();
	}
	
	public void method14() {
		System.out.println("run time");
		throw new IllegalArgumentException();
	}
	
	public void method15() {
		System.out.println("run time");
		throw new IllegalMonitorStateException();
	}
	
	public void method16() {
		System.out.println("run time");
		throw new IllegalPathStateException();
	}
	
	public void method17() {
		System.out.println("run time");
		throw new IllegalStateException();
	}
	
	public void method18() {
		System.out.println("run time");
		throw new IllformedLocaleException();
	}
	
	public void method19() {
		System.out.println("run time");
		throw new ImagingOpException(null);
	}
	
	public void method20() {
		System.out.println("run time");
		throw new IncompleteAnnotationException(null, null);
	}
	
	public void method21() {
		System.out.println("run time");
		throw new MissingResourceException(null, null, null);
	}
	
	public void method22() {
		System.out.println("run time");
		throw new MirroredTypeException(null);
	}
	
	public void method23() {
		System.out.println("run time");
		throw new MalformedParameterizedTypeException();
	}
	
	public void method24() {
		System.out.println("run time");
		throw new LSException((short) 0, null);
	}
	
	public void method25() {
		System.out.println("run time");
		throw new JMRuntimeException();
	}
	
	public void method26() {
		System.out.println("run time");
		throw new IndexOutOfBoundsException();
	}
	
	public void method27() {
		System.out.println("run time");
		throw new NegativeArraySizeException();
	}
	
	public void method28() {
		System.out.println("run time");
		throw new NoSuchElementException();
	}
	
	public void method29() {
		System.out.println("run time");
		throw new NoSuchMechanismException();
	}
	
	public void method30() {
		System.out.println("run time");
		throw new NullPointerException();
	}
	
	public void method31() {
		System.out.println("run time");
		throw new ProfileDataException(null);
	}
	
	public void method32() {
		System.out.println("run time");
		throw new ProviderException();
	}
	
	public void method33() {
		System.out.println("run time");
		throw new SecurityException();}
	
	public void method34() {
		System.out.println("run time");
		throw new RejectedExecutionException();
	}
	
	public void method35() {
		System.out.println("run time");
		throw new UndeclaredThrowableException(null);
	}
	
	public void methods1() throws FontFormatException {
	System.out.println("class exception");
	throw new FontFormatException(null);
	}
	
	   public void methods2() throws ActivationException {
		System.out.println("class exception");
		throw new ActivationException();
		}
	   
	   public void methods3() throws AlreadyBoundException {
			System.out.println("class exception");
			throw new AlreadyBoundException();
			}
	   
	   public void methods4() throws ApplicationException {
			System.out.println("class exception");
			throw new ApplicationException(null, null);
			}
	   
	   public void methods5() throws BadAttributeValueExpException {
			System.out.println("class exception");
			throw new BadAttributeValueExpException(null);
			}
	   
	   public void methods6() throws AWTException {
			System.out.println("class exception");
			throw new AWTException(null);
			}
	   
	   public void methods7() throws CloneNotSupportedException {
			System.out.println("class exception");
			throw new CloneNotSupportedException();
			}
	   
	   public void methods8() throws CertificateException {
			System.out.println("class exception");
			throw new CertificateException();
			}
	   
	   public void methods9() throws BrokenBarrierException {
			System.out.println("class exception");
			throw new BrokenBarrierException();
			}
	   
	   public void methods10() throws BadStringOperationException {
			System.out.println("class exception");
			throw new BadStringOperationException(null);
			}
	   
	   public void methods11() throws BadLocationException {
			System.out.println("class exception");
			throw new BadLocationException(null, 0);
			}
	   
	   public void methods12() throws DataFormatException {
			System.out.println("class exception");
			throw new DataFormatException();
			}
	   
	   public void methods13() throws DatatypeConfigurationException {
			System.out.println("class exception");
			throw new DatatypeConfigurationException();
			}
	   
	   public void methods14() throws DestroyFailedException {
			System.out.println("class exception");
			throw new DestroyFailedException();
			}
	   
	   public void methods15() throws GeneralSecurityException {
			System.out.println("class exception");
			throw new GeneralSecurityException();
			}
	   
	   public void methods16() throws GSSException {
			System.out.println("class exception");
			throw new GSSException(0);
			}
	   
	   public void methods17() throws IllegalClassFormatException {
			System.out.println("class exception");
			throw new IllegalClassFormatException();
			}
	   
	   public void methods18() throws InvalidMidiDataException {
			System.out.println("class exception");
			throw new InvalidMidiDataException();
			}
	   
	   public void methods19() throws LastOwnerException {
			System.out.println("class exception");
			throw new LastOwnerException();
			}
	   
	   public void methods20() throws LineUnavailableException {
			System.out.println("class exception");
			throw new LineUnavailableException();
			}
	   
	   public void methods21() throws MarshalException {
			System.out.println("class exception");
			throw new MarshalException(null);
			}
	   
	   public void methods22() throws MimeTypeParseException {
			System.out.println("class exception");
			throw new MimeTypeParseException();
			}
	   
	   public void methods23() throws NamingException {
			System.out.println("class exception");
			throw new NamingException();
			}
	   
	   public void methods24() throws PrintException {
			System.out.println("class exception");
			throw new PrintException();
			}
	   
	   public void methods25() throws ParserConfigurationException {
			System.out.println("class exception");
			throw new ParserConfigurationException();
			}
	   
	   
	   
	   public void methods26() throws RemarshalException {
			System.out.println("class exception");
			throw new RemarshalException();
			}
	   
	   
	   
	   public void methods27() throws PropertyVetoException {
			System.out.println("class exception");
			throw new PropertyVetoException(null, null);
			}
	   
	   public void methods28() throws TooManyListenersException {
			System.out.println("class exception");
			throw new TooManyListenersException();
			}
	   
	   public void methods29() throws UnmodifiableClassException {
			System.out.println("class exception");
			throw new UnmodifiableClassException();
			}
	   
	   public void methods30() throws XAException {
			System.out.println("class exception");
			throw new XAException();
			}
	   
	   public void methods31() throws NoninvertibleTransformException {
			System.out.println("class exception");
			throw new NoninvertibleTransformException(null);
			}
	   
	   public void methods32() throws NotOwnerException {
			System.out.println("class exception");
			throw new NotOwnerException();
			}
	   
	   public void methods33() throws InterruptedException {
			System.out.println("class exception");
			throw new InterruptedException();
			}
	   
	   public void methods34() throws RefreshFailedException {
			System.out.println("class exception");
			throw new RefreshFailedException();
			}
	   
	   public void methods35() throws XPathException {
			System.out.println("class exception");
			throw new XPathException();
			}
	   
	   public void methodE1() {
		   System.out.println("error");
		   throw new AssertionError(null);
	   }
	   
	   public void methodE2() {
		   System.out.println("error");
		   throw new AWTError(null); 
   }
	 
	   public void methodE3() {
		   System.out.println("error");
		   throw new CoderMalfunctionError(null);
	}
	   
	   public void methodE4() {
		   System.out.println("error");
		   throw new FactoryConfigurationError();
	}
	   
	   public void methodE5() {
		   System.out.println("error");
		   throw new IOError(null);
	}
	   
	   public void methodE6() {
		   System.out.println("error");
		   throw new LinkageError();
	}
	   
	   public void methodE7() {
		   System.out.println("error");
		   throw new ServiceConfigurationError("error");
	}
	   
	   public void methodE8() {
		   System.out.println("error");
		   throw new ThreadDeath();
	}
	   
	   public void methodE9() {
		   System.out.println("error");
		   throw new TransformerFactoryConfigurationError();
	}
	   
	   public void methodE10() {
		   System.out.println("error");
		   throw new VirtualMachineError() {
		};
	}
	   
	   public void methodE11() {
		   System.out.println("error");
		   throw new InternalError();
	}
	   
	   public void methodE12() {
		   System.out.println("error");
		   throw new OutOfMemoryError();
	}
	   
	   public void methodE13() {
		   System.out.println("error");
		   throw new StackOverflowError();
	}
	   
	   public void methodE14() {
		   System.out.println("error");
		   throw new UnknownError();
	}
	   
	   public void methodE15() {
		   System.out.println("error");
		   throw new BootstrapMethodError();
	}
	   
	   public void methodE16() {
		   System.out.println("error");
		   throw new ClassCircularityError();
	}
	   
	   public void methodE17() {
		   System.out.println("error");
		   throw new ClassFormatError();
	}
	   
	   public void methodE18() {
		   System.out.println("error");
		   throw new ExceptionInInitializerError();
	}
	   
	   public void methodE19() {
		   System.out.println("error");
		   throw new IncompatibleClassChangeError();
	}
	   
	   public void methodE20() {
		   System.out.println("error");
		   throw new NoClassDefFoundError();
	}
	   
	   public void methodE21() {
		   System.out.println("error");
		   throw new UnsatisfiedLinkError();
	}
	   
	   public void methodE22() {
		   System.out.println("error");
		   throw new VerifyError();
	}
	   
	   public void methodE23() {
		   System.out.println("error");
		   throw new ZipError(null);
	}
	   
	   public void methodE24() {
		   System.out.println("error");
		   throw new GenericSignatureFormatError();
	}
	   
	   public void methodE25() {
		   System.out.println("error");
		   throw new UnsupportedClassVersionError();
	}
	   
	   public void methodE26() {
		   System.out.println("error");
		   throw new AbstractMethodError();
	}
	   
	   public void methodE27() {
		   System.out.println("error");
		   throw new IllegalAccessError();
	}
	   
	   public void methodE28() {
		   System.out.println("error");
		   throw new NoSuchFieldError();
	}
	   
	   public void methodE29() {
		   System.out.println("error");
		   throw new NoSuchMethodError();
	}
	   
	   public void methodE30() {
		   System.out.println("error");
		   throw new InstantiationError();
	}
	   
		
	}
	
	


