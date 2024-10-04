# Definindo a classe base 'Instrumento' (Exemplo de *Classe*)
class Instrumento:
    # Construtor da classe base (Exemplo de *Construtor*)
    def _init_(self, nome, tipo):
        self.nome = nome  # Atributo de instância 'nome' (Exemplo de *Atributo*)
        self.tipo = tipo  # Atributo de instância 'tipo' (Exemplo de *Atributo*)

    # Método da classe base que pode ser sobrescrito (Exemplo de *Polimorfismo* e preparação para *Herança*)
    def tocar(self):
        raise NotImplementedError("Este método deve ser sobrescrito pelas subclasses")

# Definindo a classe derivada 'Guitarra', que herda de 'Instrumento' (Exemplo de *Herança*)
class Guitarra(Instrumento):
    # Construtor da classe derivada (Exemplo de *Construtor*)
    def _init_(self, nome, numero_de_cordas):
        # Chamando o construtor da classe base (Parte da *Herança*)
        super()._init_(nome, 'Corda')
        self.numero_de_cordas = numero_de_cordas  # Atributo adicional específico de Guitarra (Exemplo de *Atributo*)

    # Sobrescrevendo o método 'tocar' para a classe Guitarra (Exemplo de *Polimorfismo*)
    def tocar(self):
        return f"{self.nome} está tocando com {self.numero_de_cordas} cordas."

# Definindo a classe derivada 'Piano', que herda de 'Instrumento' (Exemplo de *Herança*)
class Piano(Instrumento):
    # Construtor da classe derivada (Exemplo de *Construtor*)
    def _init_(self, nome, numero_de_teclas):
        # Chamando o construtor da classe base (Parte da *Herança*)
        super()._init_(nome, 'Teclado')
        self.numero_de_teclas = numero_de_teclas  # Atributo adicional específico de Piano (Exemplo de *Atributo*)

    # Sobrescrevendo o método 'tocar' para a classe Piano (Exemplo de *Polimorfismo*)
    def tocar(self):
        return f"{self.nome} está tocando com {self.numero_de_teclas} teclas."

# Definindo a classe derivada 'Bateria', que herda de 'Instrumento' (Exemplo de *Herança*)
class Bateria(Instrumento):
    # Construtor da classe derivada (Exemplo de *Construtor*)
    def _init_(self, nome, tamanho_do_tambor):
        # Chamando o construtor da classe base (Parte da *Herança*)
        super()._init_(nome, 'Percussão')
        self.tamanho_do_tambor = tamanho_do_tambor  # Atributo adicional específico de Bateria (Exemplo de *Atributo*)

    # Sobrescrevendo o método 'tocar' para a classe Bateria (Exemplo de *Polimorfismo*)
    def tocar(self):
        return f"{self.nome} está tocando com um tambor de {self.tamanho_do_tambor} polegadas."

# Função principal para demonstrar polimorfismo (Exemplo de *Polimorfismo*)
def demonstrar_polimorfismo(instrumentos):
    for instrumento in instrumentos:
        try:
            print(instrumento.tocar())  # Chamando o método 'tocar' em cada objeto de instrumento (Parte do *Polimorfismo*)
        except NotImplementedError as e:
            print(f"Erro: {e}")  # Tratando exceção caso o método não seja implementado (Exemplo de *Tratamento de Exceções*)

# Criando instâncias de cada classe derivada (Exemplo de *Instâncias*)
guitarra = Guitarra("Fender Stratocaster", 6)
piano = Piano("Yamaha Grand", 88)
bateria = Bateria("Pearl Snare", 14)

# Lista de instrumentos (Trabalhando com *Instâncias*)
instrumentos = [guitarra, piano, bateria]

# Demonstrando polimorfismo (Parte do *Polimorfismo*)
demonstrar_polimorfismo(instrumentos)

# Tentativa de criar uma instância da classe base (o que deve falhar) (Exemplo de *Tratamento de Exceções*)
try:
    instrumento_generico = Instrumento("Instrumento Genérico", "Desconhecido")
    print(instrumento_generico.tocar())
except NotImplementedError as e:
    print(f"Não pode tocar: {e}")