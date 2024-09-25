 # Sistema de Gerenciamento de Centros de Convenções

## Entidades

### 1. Sala
- **ID**: Identificador único da sala.
- **Nome**: Nome da sala.
- **Capacidade**: Capacidade máxima de pessoas que a sala pode acomodar.

### 2. Evento
- **ID**: Identificador único do evento.
- **Nome**: Nome do evento.
- **Data e Hora**: Data e hora de início e término do evento.
- **Sala**: Sala onde o evento será realizado.
- **Organizador**: Organizador responsável pelo evento.
- **Participantes**: Lista de participantes confirmados para o evento.

### 3. Organizador
- **ID**: Identificador único do organizador.
- **Nome**: Nome do organizador.
- **Contato**: Informações de contato do organizador.
- **Eventos**: Lista de eventos que o organizador está gerenciando.

## Serviços

### 1. Serviço de Agendamento
- **Descrição**: Responsável por gerenciar o agendamento de eventos nas salas disponíveis.
- **Funcionalidades**:
    - **Verificar Disponibilidade**: Verifica se a sala está disponível na data e hora solicitada.
    - **Reservar Sala**: Reserva uma sala para um evento específico.
    - **Cancelar Reserva**: Cancela uma reserva existente.

### 2. Serviço de Logística
- **Descrição**: Gerencia a logística dos eventos, incluindo a organização dos recursos e atendimento às necessidades dos participantes.
- **Funcionalidades**:
    - **Alocar Recursos**: Aloca recursos necessários para um evento específico.
    - **Coordenação de Equipe**: Coordena a equipe para suporte durante o evento.
    - **Planejamento de Infraestrutura**: Planeja a infraestrutura necessária para o evento, como assentos, áudio e vídeo.

## Repositórios

### 1. Repositório de Salas
- **Descrição**: Armazena e gerencia os dados das salas disponíveis no centro de convenções.
- **Funcionalidades**:
    - **Adicionar Sala**: Adiciona uma nova sala ao repositório.
    - **Atualizar Sala**: Atualiza as informações de uma sala existente.
    - **Remover Sala**: Remove uma sala do repositório.
    - **Buscar Sala**: Busca por salas disponíveis com base em critérios específicos.

### 2. Repositório de Eventos
- **Descrição**: Armazena e gerencia os dados dos eventos agendados.
- **Funcionalidades**:
    - **Adicionar Evento**: Adiciona um novo evento ao repositório.
    - **Atualizar Evento**: Atualiza as informações de um evento existente.
  
